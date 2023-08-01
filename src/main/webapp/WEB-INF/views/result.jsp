<html>
<body>

  <%
    Integer addition  = (Integer)request.getAttribute("res_sum");
    Integer substraction  = (Integer)request.getAttribute("res_sub");
    Integer multiplication  = (Integer)request.getAttribute("res_multi");
    
  %>

  
	<h2> Sum is : </h2> <%=addition%>
	<h2> Substraction is : </h2> <%=substraction%>
	<h2> Multiplication is : </h2> <%=multiplication%>

</body>
</html>
