<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String type = request.getParameter("type");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head id=Head1><TITLE>模板</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <link href="YHChannelApply.files/Style.css" type=text/css rel=stylesheet>
    <link href="YHChannelApply.files/Manage.css" type=text/css rel=stylesheet>
    <script language=javascript src="YHChannelApply.files/FrameDiv.js"></script>
    <script language=javascript src="YHChannelApply.files/Common.js"></script>
    <script>
        function add() {
            document.ThisForm.submit();
        }
    </script>
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</head>

<body>
<form id="ThisForm" name="ThisForm"
      action="<%=path %>/ksAdd.action?subjectInfo=${subjectInfo}"
      method=post>
    <input type="hidden" id="type" name="type" value="<%=type %>">
    <table cellSpacing=0 cellPadding=0 width="98%" border=0>
        <tbody>
        <tr>
            <td width=15><IMG src="YHChannelApply.files/new_019.jpg" border=0></td>
            <td width="100%" background=YHChannelApply.files/new_020.jpg height=20></td>
            <td width=15><IMG src="YHChannelApply.files/new_021.jpg"
                              border=0></td>
        </tr>
        </tbody>
    </table>
    <table cellSpacing=0 cellPadding=0 width="98%" border=0>
        <tbody>
        <tr>
            <td width=15 background=YHChannelApply.files/new_022.jpg><IMG
                    src="YHChannelApply.files/new_022.jpg" border=0></td>
            <td vAlign=top width="100%" bgColor=#ffffff>
                <table cellSpacing=0 cellPadding=5 width="100%" border=0>
                    <tr>
                        <td class=manageHead>当前位置：管理首页 &gt; 制定试卷&gt; 制定试卷</td>
                    </tr>
                    <tr>
                        <td height=2></td>
                    </tr>
                </table>
                <table borderColor=#cccccc cellSpacing=0 cellPadding=0 width="100%"
                       align=center border=0>
                    <tbody>

                    <tr>
                        <td>
                            <table id=grid
                                   style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
                                   cellSpacing=1 cellPadding=2 rules=all border=0>
                                <tbody>
                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">考试名</td>
                                    <td><textarea rows="10" cols="30" id="title" name="title"></textarea></td>
                                </tr>
                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">考试时间</td>
                                    <td><input type="text" id="times" name="times"/></td>
                                </tr>

                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">单选题</td>
                                    <td>数量<input type="text" id="dxtsl" name="dxtsl"/>每题分值<input type="text" id="dxtfz"
                                                                                                 name="dxtfz"/></td>
                                </tr>

                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">多选题</td>
                                    <td>数量<input type="text" id="ddxtsl" name="ddxtsl"/>每题分值<input type="text"
                                                                                                   id="ddxtfz"
                                                                                                   name="ddxtfz"/></td>
                                </tr>

                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">判断题</td>
                                    <td>数量<input type="text" id="pdsl" name="pdsl"/>每题分值<input type="text" id="pdfz"
                                                                                               name="pdfz"/></td>
                                </tr>
                                <tr
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td align="center">填空题</td>
                                    <td>数量<input type="text" id="bcsl" name="bcsl"/>每题分值<input type="text" id="bcfz"
                                                                                               name="bcfz"/></td>
                                </tr>

                                </tbody>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td align=right height=25>
                            <INPUT class=button id=button1 type=button value="确定" name=button1 onclick="add()">
                        </td>
                    </tr>
                    </tbody>
                </table>
            </td>
            <TD width=15 background=YHChannelApply.files/new_023.jpg><IMG
                    src="YHChannelApply.files/new_023.jpg" border=0></TD>
        </tr>
        </tbody>
    </table>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="YHChannelApply.files/new_024.jpg" border=0></TD>
            <TD align=middle width="100%" background=YHChannelApply.files/new_025.jpg
                height=15></TD>
            <TD width=15><IMG src="YHChannelApply.files/new_026.jpg"
                              border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</form>
</body>
</HTML>


