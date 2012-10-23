<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : product_type_detail
    Created on : Oct 19, 2012, 10:27:48 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <table border="0">
            <thead>
                <tr>
                    <th>รหัส</th>
                    <th>รูป</th>
                    <th>ชนิดสินค้า</th>
                    <th>รายละเอียด</th>
                    <th>แก้ไข</th>
                    <th>ลบ</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="productType" items="${result}">
                    <tr>
                        <td>${ProductType.prodTypeCode}</td>
                        <td><img src="../img/prod-type/${productType.picture}.jpg"/></td>
                        <td>${ProductType.prodTypeName}</td>
                        <td>${ProductType.description}</td>
                        <td>
                            <a href="GetProductTypeDetail?id=${productType.id}">
                                <img src="../css/img/edit.png"/>
                            </a>
                        </td>
                        <td>
                            <a href="DeleteProductType?id=${productType.id}">
                                <img src="../css/img/del.png"/>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
