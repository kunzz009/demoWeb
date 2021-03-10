<%@include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
    <c:forEach items="${arr}" var ="objsp">
        <tr>
            <td>
                <img src="${Objsp.getAnh()}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<%@include file="footer.jsp" %>
