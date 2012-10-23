<%-- 
    Document   : upload_po
    Created on : Sep 16, 2012, 8:17:46 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript" src="../js/jquery.tables.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#navigator').each(function() {
            if($(this).hide()) {
                $(this).fadeIn('slow');
                $('#content').animate({ width : '81%'}, 'normal');
                return false;
            } 
        });
    });
    
    $(function(){
        $('.multi-pt').MultiFile({
            accept:'gif|jpg|png|pdf', max:5, STRING: {
                remove:'x',
                selected:'เลือกไฟล์ $file',
                denied:'ไม่อนุญาตให้อัพโหลดไฟล์ $ext!\nคุณสามารถอัพโหลดไฟล์ชนิด .png, .jpg, .gif เท่านั้น',
                duplicate:'มีรายการนี้แล้ว กรุณาลองอีกครั้ง:\n$file!'
            }
        });
    });
</script>

<form id="uploadPo" name="uploadPo">
    <fieldset>
        <legend>สั่งซื้อสินค้า (PO)</legend>
        <ul>
            <li id="service">
                <div class="serv-img"></div>
                <ul>
                    <li>
                        <table class="unsort" border="0">
                            <tbody>
                                <tr>
                                    <td>รหัสลูกค้า</td>
                                    <td>Customer Code</td>
                                </tr>
                                <tr>
                                    <td>ชื่อผู้ติดต่อ</td>
                                    <td>Contact Name</td>
                                </tr>
                                <tr>
                                    <td>บริษัท</td>
                                    <td>Company</td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="sortable" border="0">
                            <thead>
                                <tr>
                                    <th>รหัสสินค้า</th>
                                    <th>ชื่อสินค้า</th>
                                    <th>ชนิดสินค้า</th>
                                    <th>จำนวน</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <select class="select-style" name="prod_code">
                                            <option>- Select -</option>
                                            <option>code 1</option>
                                            <option>code 2</option>
                                        </select>
                                    </td>
                                    <td>Product Name</td>
                                    <td>Product Type</td>
                                    <td>
                                        <input type="text" name="quantity" value="" />
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="unsort" border="0">
                            <tbody>
                                <tr>
                                    <td valign="top">หมายเหตุ</td>
                                    <td>
                                        <textarea name="comment" rows="10" cols="30">
                                        </textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td>อัพโหลดเอกสาร</td>
                                    <td>
                                        <div id="uploadBtn">
                                            <input id="realUpload" class="multi-pt" type="file" name="" value="" accept="gif|jpg|png|pdf" />
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td>
                                        <input type="submit" value="Send" name="quatationSubmit" />
                                        <input type="reset" value="Cancel" name="cancel" />
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </li>
                </ul>
            </li>
        </ul>
    </fieldset>
</form>
