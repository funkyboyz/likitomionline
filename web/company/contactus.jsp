<%-- 
    Document   : index
    Created on : Sep 2, 2012, 1:34:38 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#navigator').each(function() {
                    $(this).hide(function() {
                        $(this).fadeOut('slow');
                        $('#content').animate({ width : '97%' }, 'slow');
                        return false;
                    });
                });
            });
            
            $(document).ready(function() {
                $('#map img[title]').tooltip();
            });
        </script>
    </head>
    <body>
        <form name="contact_us" id="formContactUs">
            <div class="topic">
                <div class="contact-img"></div>
                <h3>Factory</h3>
                <p class="addr">
                    <b>Likitomi(Thailand) Co.,Ltd.</b><br />
                    82 Moo 1 Wellgrow Industrial Estate, <br />
                    Bangna-Trad Rd. Km.36, <br />
                    Homseal Bang-Pakong, <br />
                    Chachoengsao 24180 <br />
                    Thailand <br />
                    Tel. 038-570092-099 <br />
                    Fax. 038-570-679 <br />
                </p>

                <h3>Email</h3>
                <p class="addr">
                    <a class="mailto" href="mailto:salesupport@likitomi.co.th">salesupport@likitomi.co.th</a>
                </p>
            </div>
            <div id="map">
                <h3>Map</h3>
                <div class="map-img">
                    <a id="map-img" href="../css/img/map_liki_large.jpg" title="Likitomi Map" >
                        <img class="map-img" src="../css/img/map_liki.jpg"alt="Likitomi Map" title="Likitomi Map Click to view large image"/>
                    </a>
                </div>
                <div class="map-net">
                    <iframe width="425" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" 
                            src="https://maps.google.com/maps/ms?msa=0&amp;msid=211117036042206443640.0004c8beca35119ffb007&amp;hl=th&amp;ie=UTF8&amp;t=h&amp;ll=13.572521,100.9222&amp;spn=0,0&amp;output=embed">
                    </iframe>
                    <br />
                    <small>ดู 
                        <a href="https://maps.google.com/maps/ms?msa=0&amp;msid=211117036042206443640.0004c8beca35119ffb007&amp;hl=th&amp;ie=UTF8&amp;t=h&amp;ll=13.572521,100.9222&amp;spn=0,0&amp;source=embed" target="_blank" style="color:#0000FF;text-align:left">
                            บริษัท ลิคิโทมิ (ประเทศไทย) จำกัด
                        </a> ในแผนที่ขนาดใหญ่กว่า
                    </small>
                </div>
            </div>
        </form>
    </body>
</html>
