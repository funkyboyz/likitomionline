<%-- 
    Document   : aboutus
    Created on : Aug 31, 2012, 9:49:03 PM
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
                    }, function() {
                        $('#content').animate({ width : '97%' }, 'slow');
                        return false;
                    });
                });
                
                $('#slideshows img[title]').tooltip();
                return false;
            });
        </script>
    </head>
    <body>
        <form name="about_us" id="formAboutUs" >
            <div class="topic">
                <div class="banner-img"></div>
                <h3>Company Profile</h3>
                <p class="pg">
                    Likitomi was established in 1991 at Wellgrow Industrial Estate Chachoengsao. Likitomi has manufactured high quality 
                    corrugated boxes and boards support various goods for a decade. The attainment of ISO9001 and ISO14001 certification 
                    clearly indicate the company’s international standards. 
                    Mission of Likitomi is “To produce high quality corrugated boxes and boards serve customers’ need as acquired standard, 
                    on-time delivery to achieve customer satisfaction”
                </p>
                <p class="pg">
                    With well-equipped of high-speed corrugator , 2-4 Colors Printer slotters , Rotary die cutter and converting equipments 
                    in area 44,800 M2 convey superior products and providing punctual delivery services as our reputation in market. Production 
                    techniques and design development are transferred from our Japanese partners. In house preparation from design, sample 
                    cutting, compression testing, printing plate making, die cutting plate making give the appropriated quality and punctual 
                    product development serve the modern style marketing. 
                </p>
                <p class="pg">
                    200 valued employees with quality conscious, skilled and morale are continuous trained to upgrade and boosting the 
                    efficiency. Likitomi provide our employees a excellent personnel fringe benefits Materials that Likitomi use, are from 
                    the best selected suppliers in Thailand, were tested and guarantees by well-known organizations. High precision of quality 
                    control laboratory and quality-conscious employees closely monitor every stage of production process from incoming raw 
                    materials right-up to random testing of finished product with international standard method such as ISO , TAPPI and JIS. 
                    Not only quality control, Likitomi also stem up “Hazardous control committee” to watch over every materials and processes 
                    to comply to various standards such as RoHS (Restriction on use of hazardous substances in Electrical and Electronic 
                    Equipment), SoC(Substances of Environmental Concern) etc. 
                </p>
            </div>
            <div class="topic">
                <h3>Brochure</h3>
                <div id="slideshows">
                    <div class="slideshows-img">
                        <a class="fancybox" rel="gallery" href="../css/brochure/photo1.jpg" title="Brochure page 1">                        
                            <img src="../css/brochure/photo1_s.png" width="113" height="150" alt="Brochure page 1" title="Brochure page 1 Click to view large image"/> 
                        </a>
                        <a class="fancybox" rel="gallery" href="../css/brochure/photo2.JPG" title="Brochure page 2">
                            <img src="../css/brochure/photo2_s.png" width="113" height="150" alt="Brochure page 2" title="Brochure page 2 Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery" href="../css/brochure/photo3.jpg" title="Brochure page 3">
                            <img src="../css/brochure/photo3_s.png" width="113" height="150" alt="Brochure page 3" title="Brochure page 3 Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery" href="../css/brochure/photo4.jpg" title="Brochure page 4">
                            <img src="../css/brochure/photo4_s.png" width="113" height="150" alt="Brochure page 4" title="Brochure page 4 Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery" href="../css/brochure/photo5.jpg" title="Brochure page 5">
                            <img src="../css/brochure/photo5_s.png" width="113" height="150" alt="Brochure page 5" title="Brochure page 5 Click to view large image"/>
                        </a>
                    </div>
                </div>
            </div>

            <div class="topic-img">
                <h3>Organization chart</h3>
                <div class="company-img"></div>
            </div>

            <div class="topic">
                <h3>Company Policy</h3>
                <p class="pg">We are training staff total 8 courses.</p>
                <ul class="topic-list">
                    <li>5s Activity</li>
                    <li>A safe operation</li>
                    <li>Energy conservation</li>
                    <li>Garbage</li>
                    <li>Drug addiction</li>
                    <li>Corrugated</li>
                    <li>ISO 9001:2000</li>
                    <li>ISO 14001: 2004</li>
                </ul>

                <h3>Quality ISO 9001</h3>
                <ul class="topic-list">
                    <li>Produce corrugated sheets according to customer requirements and quality standards set.</li>
                    <li>Deliver products to customers on time.</li>
                    <li>Ensure customer satisfaction in the quality of products and services.</li>
                </ul>

                <h3>Environmental Policy ISO 14004</h3>
                <ul class="topic-list">
                    <li>
                        Promote the use of energy and resources in the production process to achieve maximum performance. 
                        As well as the prevention of pollution and waste caused by the production process. With minimal 
                        environmental impact.
                    </li>
                    <li>
                        Requires compliance with environmental laws and regulations.
                    </li>
                    <li>
                        Defined objectives and goals in environmental management. And a review Objectives and targets to 
                        achieve continuous improvement and timely.
                    </li>
                    <li>
                        Policy and the promotion of environmental information provided. Staff and workers involved. 
                        The public has been informed.
                    </li>
                </ul>
            </div>

            <div class="topic">
                <h3>ISO Certificates</h3>
                <div id="slideshows">
                    <div class="slideshows-img2">
                        <a class="fancybox" rel="gallery1" href="../css/cert/front.jpg" title="ISO Certificate">
                            <img src="../css/cert/front_small.png" alt="ISO Certificate" title="ISO Certificate Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery1"  href="../css/cert/ISO9001.jpg" title="ISO 9001 Certificate">
                            <img src="../css/cert/ISO9001_small.png" alt="ISO 9001 Certificate" title="ISO 9001 Certificate Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery1"  href="../css/cert/ISO14001.jpg" title="ISO 14001 Certificate">
                            <img src="../css/cert/ISO14001_small.png" alt="ISO 14001 Certificate" title="ISO 14001 Certificate Click to view large image"/>
                        </a>
                    </div>
                </div>
            </div>

            <div class="topic">
                <h3>Awards</h3>
                <div id="slideshows">
                    <div class="slideshows-img3">
                        <a class="fancybox" rel="gallery2"  href="../css/cert/logo4.jpg" title="Energy conservation Awards">
                            <img src="../css/cert/logo4_s.png" alt="Energy conservation Awards" title="Energy conservation Awards Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery2" href="../css/cert/logo1.jpg" title="BOT Awards">
                            <img src="../css/cert/logo1_s.png" alt="BOT Awards" title="BOT Awards Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery2"  href="../css/cert/logo2.jpg" title="A.P. Awards">
                            <img src="../css/cert/logo2_s.png" alt="A.P. Awards" title="A.P. Awards Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery2"  href="../css/cert/logo3.jpg" title="Environment Awards">
                            <img src="../css/cert/logo3_s.png" alt="Environment Awards" title="Environment Awards Click to view large image"/>
                        </a>
                    </div>
                </div>
            </div>

            <div class="topic">
                <h2>News & Events</h2>
                <h3>Fire Drill Activity</h3>
                <p class="pg">
                    Fire evacuation drills are conducted through October each year. Employees to know how to use the 
                    equipment in the fire were on the scene to fire up. And how to protect yourself on fire.
                </p>
                <div id="slideshows">
                    <div class="slideshows-img4">
                        <a class="fancybox" rel="gallery3" href="../css/fire-drill/ac1.jpg" title="Fire Drill Activity">
                            <img src="../css/fire-drill/ac1_s.png" alt="Fire Drill Activity" title="Fire Drill Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery3"  href="../css/fire-drill/ac2.jpg" title="Fire Drill Activity">
                            <img src="../css/fire-drill/ac2_s.png" alt="Fire Drill Activity" title="Fire Drill Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery3"  href="../css/fire-drill/ac3.jpg" title="Fire Drill Activity">
                            <img src="../css/fire-drill/ac3_s.png" alt="Fire Drill Activity" title="Fire Drill Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery3"  href="../css/fire-drill/ac4.jpg" title="Fire Drill Activity">
                            <img src="../css/fire-drill/ac4_s.png" alt="Fire Drill Activity" title="Fire Drill Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery3"  href="../css/fire-drill/ac5.jpg" title="Fire Drill Activity">
                            <img src="../css/fire-drill/ac5_s.png" alt="Fire Drill Activity" title="Fire Drill Activity Click to view large image"/>
                        </a>
                    </div>
                </div>
            </div>

            <div class="topic">
                <h3>Big Cleaning Day</h3>
                <p class="pg">
                    His Majesty the King on the occasion of his 80th anniversary celebrations. The Board of Directors has established 
                    5s garbage every first Saturday of every month. To honor. And create awareness for employees. Helping to maintain 
                    the cleanliness of the workplace. The government is likely to do more work.
                </p>
                <p class="pg">
                    5 Committee on the Establishment of the project is to understand the purpose of the project staff. 
                    In order to create awareness for staff to help maintain the cleanliness of the workplace and how to properly 
                    separate waste before disposal to protect the environment and easy waste separation.
                </p>
                <div id="slideshows">
                    <div class="slideshows-img5">
                        <a class="fancybox" rel="gallery4" href="../css/bigcleaning/acti1.jpg" title="Big Cleaning Day Activity">
                            <img src="../css/bigcleaning/acti1_s.png" alt="Big Cleaning Day Activity" title="Big Cleaning Day Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery4"  href="../css/bigcleaning/acti2.jpg" title="Big Cleaning Day Activity">
                            <img src="../css/bigcleaning/acti2_s.png" alt="Big Cleaning Day Activity" title="Big Cleaning Day Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery4"  href="../css/bigcleaning/acti3.jpg" title="Big Cleaning Day Activity">
                            <img src="../css/bigcleaning/acti3_s.png" alt="Big Cleaning Day Activity" title="Big Cleaning Day Activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery4"  href="../css/bigcleaning/acti4.jpg" title="Big Cleaning Day Activity">
                            <img src="../css/bigcleaning/acti4_s.png" alt="Big Cleaning Day Activity" title="Big Cleaning Day Activity Click to view large image"/>
                        </a>
                    </div>
                </div>

            </div>
            <div class="topic">
                <h3>Nhong e-thone Philanthropic activity</h3>
                <div id="slideshows">
                    <div class="slideshows-img6">
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/001.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/001_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/002.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/002_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/003.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/003_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/004.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/004_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/005.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/005_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/006.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/006_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/007.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/007_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/008.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/008_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/009.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/009_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/010.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/010_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/011.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/011_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/012.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/012_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/013.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/013_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/014.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/014_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/015.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/015_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/016.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/016_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/017.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/017_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/018.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/018_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/019.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/019_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/020.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/020_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/021.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/021_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                        <a class="fancybox" rel="gallery5" href="../css/nong-E-thone/022.jpg" title="Nhong e-thone Philanthropic activity">
                            <img src="../css/nong-E-thone/022_s.png" alt="Nhong e-thone Philanthropic activity" title="Nhong e-thone Philanthropic activity Click to view large image"/>
                        </a>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>

