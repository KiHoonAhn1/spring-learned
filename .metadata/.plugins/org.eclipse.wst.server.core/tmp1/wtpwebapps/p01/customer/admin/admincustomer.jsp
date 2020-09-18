<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#center>h3>im{
width:50px;
}

table{
width:100px;
margin-top:50px;
margin-left:30px;
margin-right:100px;

}
</style>

 

      
     
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              
              <th>아이디</th>
              <th>이름</th>
              <th>주소</th>
             
            </tr>
          </thead>
          <tbody>
           
            <c:forEach var="c" items="${customerlist}">
               <tr><td><a href="admincustomerdetail.mc?id=${c.id}">${c.id}</a></td>
              <td><a href="admincustomerdetail.mc?id=${c.id}">${c.name}</a></td>
              <td><a href="admincustomerdetail.mc?id=${c.id}">${c.adress}</a></td>
             
              </c:forEach>
            
          
          </tbody>
        </table>
     

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="dashboard.js"></script>