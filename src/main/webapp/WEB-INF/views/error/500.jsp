<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory" %>
<%@ page import="com.fosun.fc.modules.utils.Exceptions" %>

<%	
	//设置返回码200，避免浏览器自带的错误页面
	response.setStatus(200);
	//记录日志
	Logger logger = LoggerFactory.getLogger("500.jsp");
	logger.error(exception.getMessage(), exception);
%>
<!-- Main content starts -->

<div class="content">
  	<!-- Main bar -->
  	<div class="mainbar">

      <!-- Page heading -->
      <div class="page-head">
        <h2 class="pull-left"><i class="icon-table"></i>异常信息</h2>
        <!-- Breadcrumb -->
        <div class="bread-crumb pull-right">
          <a href="/index"><i class="icon-home"></i> Home</a> 
          <!-- Divider -->
          <span class="divider">/</span> 
          <a href="#" class="bread-current">Dashboard</a>
        </div>

        <div class="clearfix"></div>

      </div>
      <!-- Page heading ends -->

	  	<!-- Matter -->
	    <div class="matter">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="widget">
                <div class="widget-head">
                  <div class="pull-left">Error Log</div>
                  <div class="widget-icons pull-right">
                    <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                    <a href="#" class="wclose"><i class="icon-remove"></i></a>
                  </div>  
                  <div class="clearfix"></div>
                </div>
                <div class="widget-content">
                  <div class="padd">
                    <div class="error-log">
                      <ul>
                        <li><span class="red"><%=Exceptions.getStackTraceAsString(exception) %></span></li>
                        <!-- Use class "green" or "red" to add color 
                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>
                        
                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>                        

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc</li>

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li> 

                        <li><span class="green">[Tue Jan 11 17:32:52 2013]</span> <span class="red">[error]</span> [google 123.124.2.2] client denied by server: /export/home/macadmin/testdoc - no such file</li>      
                        -->                                                                  
                      </ul>
                    </div>

                  </div>
                  <div class="widget-foot">
                    <!-- Footer goes here -->
                  </div>
                </div>
              </div>  
              
            </div>
          </div>
        </div>
		  </div>
		<!-- Matter ends -->
    </div>
   <!-- Mainbar ends -->	  
   <div class="clearfix"></div>
</div>
<!-- Content ends -->
