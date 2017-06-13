package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.DxtDAO;
import com.model.Dxt;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.util.Pagination;

public class DxtAction extends ActionSupport {

	private int id;
	private String idList;
	private String[] selectFlag;
	private String title;
	private String a;
	private String b;
	private String c;
	private String d;
	private String da;
	private int subjectInfo;
	private String message;
	private String path;
	private DxtDAO dao;
	private int index = 1;

	public String add() {
		Dxt demo = new Dxt();
		demo.setTitle(title);
		demo.setA(a);
		demo.setB(b);
		demo.setC(c);
		demo.setD(d);
		demo.setDa(da);
		demo.setSubjectInfo(subjectInfo);
		dao.save(demo);
		this.setMessage("��ӳɹ�");
		this.setPath("dxtList.action?subjectInfo="+subjectInfo);
		return "succeed";
	}

	public String delete() {

		//ǰ̨���ݽ���
		String idLists[] = idList.split(",");

		for (String id:idLists
				) {
			int ida = Integer.parseInt(id);
			Dxt demo = dao.findById(ida);
			dao.delete(demo);
		}
		this.setMessage("�����ɹ�");
		this.setPath("dxtList.action");
		return "succeed";
	}

	public String modifybefore() {
		
		Dxt demo = dao.findById(Integer.parseInt(selectFlag[0]));
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("bean", demo);
		return "mb";
	}

	public String modify() {
		Dxt demo = dao.findById(id);
		demo.setTitle(title);
		demo.setA(a);
		demo.setB(b);
		demo.setC(c);
		demo.setD(d);
		demo.setDa(da);
		demo.setSubjectInfo(subjectInfo);
		dao.merge(demo);
		this.setMessage("�޸ĳɹ�");
		this.setPath("dxtList.action?subjectInfo="+subjectInfo);
		return "succeed";
	}

	public String all() {

		List list = new ArrayList();
		list = dao.findAll(subjectInfo);

		int pageSize = 20;
		int totlePages = 0;
		int fromIndex = (index - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, list.size());
		List adminListFenye = list.subList(fromIndex, toIndex);

		Pagination p = new Pagination();// ���� ��ҳ����
		p.setIndex(index);// ���õ�ǰҳ
		p.setPrePage(index==1?1:index-1);//������һҳҳ��


		totlePages = list.size()%pageSize==0?list.size()/pageSize:list.size()/pageSize+1;
		p.setTotlePage(totlePages);//������ҳ����

		p.setNextPage(index==totlePages?totlePages:index+1);//������һҳҳ��

		p.setPageSize(pageSize);//ÿҳ��ʾ����������
		p.setTotle(list.size());// �����ܹ�������
		p.setData(adminListFenye);// ��������
		p.setPath("dxtList.action");// ��ת��·��

		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("page", p);
		return "list";
	}
	
//	public String szddxtList() {
//		ActionContext actionContext = ActionContext.getContext();
//		Map session = actionContext.getSession();
//		List list = dao.findAll();
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("list", list);
//		return "list";
//	}

	public String search() {
		List list = dao.findByProperty("", "");
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("list", list);
		return ActionSupport.SUCCESS;
	}

	public DxtDAO getDao() {
		return dao;
	}

	public void setDao(DxtDAO dao) {
		this.dao = dao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}
	
	public String[] getSelectFlag() {
		return selectFlag;
	}

	public void setSelectFlag(String[] selectFlag) {
		this.selectFlag = selectFlag;
	}

	public int getSubjectInfo() {
		return subjectInfo;
	}

	public void setSubjectInfo(int subjectInfo) {
		this.subjectInfo = subjectInfo;
	}

	public String getIdList() {
		return idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
	}
}
