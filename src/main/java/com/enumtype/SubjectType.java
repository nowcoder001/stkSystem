package com.enumtype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzy on 2017/6/12.
 */
public enum SubjectType {

    Chinese(1,"����"),
    Mathmatic(2,"��ѧ"),
    English(3,"Ӣ��");

    private int value;
    private String label;

    private SubjectType(int value, String label){
        this.value = value;
        this.label = label;
    }

    //�����������ƻ�ȡֵ����
    public static SubjectType get(String label){
        for(SubjectType b : SubjectType.values()){
            if(b.getLabel().equals(label)){
                return b;
            }
        }
        return null;
    }

    //����ֵ��ȡ����˵������
    public static SubjectType get(int value){
        for(SubjectType b : SubjectType.values()){
            if(b.getValue()==value){
                return b;
            }
        }
        return null;
    }

    //��ȡ�б�����
    public static List getList(){
        SubjectType[] values = SubjectType.values();
        List result = new ArrayList();
        for( int i = 0 ; i < values.length ; i++){
            result.add(new CodeBean(values[i].getValue(),values[i].getLabel()));
        }
        return result;
    }

    //��ȡȫ���б�����
    public static List getListWithBlank(){
        SubjectType[] values = SubjectType.values();
        List result = new ArrayList();
        result.add(new CodeBean(-1, "ȫ��"));
        for (int i = 0; i < values.length; i++){
            result.add(new CodeBean(values[i].getValue(),values[i].getLabel()));
        }
        return result;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
