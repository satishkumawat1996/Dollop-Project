<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="addOrganization" value="/organization/add"></c:url>
	<form:form action="${addOrganization}" commandName="organization" >
		<table>
			<tr>
				<td>
					<form:label path="orgainzationId">
						<spring:message text="Organization Id"/>
					</form:label>
				</td>
				<td>
					<form:input path="orgainzationId" readonly="true" disabled="true"/>
					<form:hidden path="orgainzationId" />
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="organizationName">
						<spring:message text="Organization Name"/>
					</form:label>
				</td>
				<td>
					<form:input path="organizationName"/>
				</td>
			</tr>
			<tr>
				
				<td colspan="2">
					<input type="submit" value='<spring:message text="Add"/>' />
				</td>
			</tr>
			
		</table>
	
	</form:form>		


</body>
</html>