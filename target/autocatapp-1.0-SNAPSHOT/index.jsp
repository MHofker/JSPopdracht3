<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.company.HelloAppEngine" %>
<%@ page import="com.company.Auto, com.company.DataUtils" %>
<%@ page import="java.util.ArrayList" %>


<html>
<head>
    <link href="Styles.css" rel="stylesheet">
    <link href='//fonts.googleapis.com/css?family=Marmelad' rel='stylesheet' type='text/css'>
    <title>Hello App Engine Standard Java 8</title>
</head>
<body>
<%--<h1>Hello App Engine -- Java 8!</h1>--%>

<p>This is <%= HelloAppEngine.getInfo() %>.</p>
<table>
    <tr>
        <td colspan="2" style="font-weight:bold;">Available Servlets:</td>
    </tr>
    <tr>
        <td><a href='/hello'>Hello App Engine</a></td>
    </tr>
</table>
<%  int minprijs = 0;
    int maxprijs = 10000;
    String merk = "alle"; %>
<div>

    <form action="index.jsp">
    <label>Kies Merk</label>
    <select id="merk" name="selected">
        <option value="alle">Alle merken</option>

        <option value="Ford">Ford
        </option>

        <option value="Opel">Opel
        </option>

        <option value="Subaru">Subaru
        </option>

        <option value="Mercedes">Mercedes
        </option>

        <option value="Ferrari">Ferrari
        </option>

        <option value="Lotus">Lotus
        </option>

        <option value="Citroen">Citroen
        </option>

        <option value="Volvo">Volvo
        </option>

        <option value="Mini">Mini
        </option>

    </select>
    <br>
    <label>Minimum prijs</label>
    <input type="text" id="minprijs" value="<%=minprijs%>">
    <label>Maximum prijs</label>
    <input type="text" id="maxprijs" value="<%=maxprijs%>">
    <br>
    <input type="submit" id="knop_merk_prijs" value="OK" name="knop_1">
</form>
</div>
<%--<div class="autokader">--%>
    <%--<img src="/AO/JSP_Java_DB/images/autos/mercedese230.jpg" alt="Mercedes E 230">--%>
    <%--<p class="merktype">Mercedes E 230</p>--%>
    <%--<p class="prijs">€ 1.000,--</p>--%>
<%--</div>--%>


<%
    ArrayList<Auto> autolijst = DataUtils.getAutolijst();
if (request.getParameter("knop_1") != null){
    for (Auto auto: autolijst) {

 if ( auto.getPrijs() >= minprijs && auto.getPrijs() <= maxprijs && (request.getParameter("selected").equals("alle") || auto.getMerk().equals(request.getParameter("selected"))) ){ System.out.println(request.getParameter("selected"));
%>
<div class="autokader">
    <img src="<%= auto.getFoto() %>" alt="">
    <p class="merktype"> <%=auto.getMerk()%> <%= auto.getType() %>
    </p>
    <p class="prijs"><%=auto.getPrijsFormat()%>
    </p>
</div>
<%} else System.out.println("Filtered: " + auto.getMerk() + auto.getType() );}}%>
</body>
</html>
