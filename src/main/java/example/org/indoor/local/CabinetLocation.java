package example.org.indoor.local;

import example.org.indoor.entity.Cabinet;

import java.util.ArrayList;
import java.util.List;

public class CabinetLocation {

    static private List<Cabinet> array = new ArrayList<>();

    static {

        ///////ПЕРВЫЙ ЭТАЖ ///////////
        Cabinet c100 = new Cabinet("100",1,699,1027,728,1112);
        array.add(c100);
        Cabinet c102 = new Cabinet("102",1,728,1027,757,1112);
        array.add(c102);
        Cabinet c102a = new Cabinet("102а",1,846,1027,872,1112);
        array.add(c102a);
        Cabinet c104 = new Cabinet("104",1,873,1027,901,1112);
        array.add(c104);
        Cabinet c106 = new Cabinet("106",1,901,1027,927,1112);
        array.add(c106);
        Cabinet c108 = new Cabinet("108",1,927,1027,958,1112);
        array.add(c108);
        Cabinet c110 = new Cabinet("110",1,958,1027,977,1112);
        array.add(c110);
        Cabinet c112 = new Cabinet("112",1,977,1027,1003,1112);
        array.add(c112);
        Cabinet c114 = new Cabinet("114",1,1003,1027,1029,1112);
        array.add(c114);
        Cabinet c116 = new Cabinet("116",1,1029,1027,1095,1112);
        array.add(c116);
        Cabinet c118 = new Cabinet("118",1,1095,1027,1121,1070);
        array.add(c118);
        Cabinet c120 = new Cabinet("120",1,1121,1027,1146,1112);
        array.add(c120);
        Cabinet c120a = new Cabinet("120а",1,1220,1027,1245,1112);
        array.add(c120a);
        Cabinet c120b = new Cabinet("120б",1,1245,1027,1271,1112);
        array.add(c120b);
        Cabinet c122 = new Cabinet("122",1,1271,1027,1295,1112);
        array.add(c122);
        Cabinet c124 = new Cabinet("124",1,1295,1027,1346,1112);
        array.add(c124);
        Cabinet c126 = new Cabinet("126",1,1346,1027,1372,1112);
        array.add(c126);
        Cabinet c128 = new Cabinet("128",1,1372,1027,1435,1112);
        array.add(c128);
        Cabinet c130 = new Cabinet("130",1,1435,1027,1458,1112);
        array.add(c130);
        Cabinet c132 = new Cabinet("132",1,1458,1027,1482,1112);
        array.add(c132);
        Cabinet c134 = new Cabinet("134",1,1482,1027,1536,1112);
        array.add(c134);
        Cabinet c136 = new Cabinet("136",1,1536,1027,1558,1112);
        array.add(c136);
        Cabinet c138 = new Cabinet("138",1,1558,1027,1631,1112);
        array.add(c138);
        Cabinet c140 = new Cabinet("140",1,1755,1027,1815,1112);
        array.add(c140);

        Cabinet c101 = new Cabinet("101",1,728,1159,757,1241);
        array.add(c101);
        Cabinet c103 = new Cabinet("103",1,757,1159,815,1241);
        array.add(c103);
        Cabinet c105 = new Cabinet("105",1,815,1159,872,1241);
        array.add(c105);
        Cabinet c105a = new Cabinet("105а",1,872,1159,900,1241);
        array.add(c105a);
        Cabinet c107 = new Cabinet("107",1,900,1159,928,1241);
        array.add(c107);
        Cabinet c109 = new Cabinet("109",1,977,1159,1003,1241);
        array.add(c109);
        Cabinet c111 = new Cabinet("111",1,1003,1159,1029,1241);
        array.add(c111);
        Cabinet c113 = new Cabinet("113",1,1029,1159,1095,1241);
        array.add(c113);
        Cabinet c115 = new Cabinet("115",1,1095,1159,1121,1241);
        array.add(c115);
        Cabinet c117 = new Cabinet("117",1,1219,1159,1271,1241);
        array.add(c117);
        Cabinet c119 = new Cabinet("119",1,1295,1159,1372,1241);
        array.add(c119);
        Cabinet c121 = new Cabinet("121",1,1372,1159,1434,1241);
        array.add(c121);
        Cabinet c123 = new Cabinet("123",1,1434,1159,1458,1241);
        array.add(c123);
        Cabinet c123b = new Cabinet("123б",1,1458,1159,1482,1241);
        array.add(c123b);
        Cabinet c123a = new Cabinet("123а",1,1482,1159,1535,1241);
        array.add(c123a);
        Cabinet c125 = new Cabinet("125",1,1559,1159,1630,1241);
        array.add(c125);
        Cabinet c125a = new Cabinet("125а",1,1630,1159,1683,1241);
        array.add(c125a);

        Cabinet c141 = new Cabinet("141",1,395,867,489,991);
        array.add(c141);
        Cabinet c142 = new Cabinet("142",1,395,714,489,828);
        array.add(c142);
        Cabinet c143 = new Cabinet("143",1,395,560,489,674);
        array.add(c143);
        Cabinet c144 = new Cabinet("144",1,395,424,489,526);
        array.add(c144);

        Cabinet sportzal = new Cabinet("спортзал",1,133,152,395,424);
        array.add(sportzal);
        Cabinet Sportzal = new Cabinet("Спортзал",1,133,152,395,424);
        array.add(Sportzal);
        Cabinet bufet = new Cabinet("буфет",1,394,1026,490,1084);
        array.add(bufet);
        Cabinet Bufet = new Cabinet("Буфет",1,394,1026,490,1084);
        array.add(Bufet);
        Cabinet bibl = new Cabinet("библиотека",1,1683,1158,1950,1412);
        array.add(bibl);
        Cabinet Bibl = new Cabinet("Библиотека",1,1683,1158,1950,1412);
        array.add(Bibl);
        Cabinet actzal = new Cabinet("актовый зал",1,227,1281,354,1406);
        array.add(actzal);
        Cabinet Actzal = new Cabinet("Актовый зал",1,227,1281,354,1406);
        array.add(Actzal);






        ///////ВТОРОЙ ЭТАЖ/////////
        Cabinet c200 = new Cabinet("200",2,601,1020,629,1095);
        array.add(c200);
        Cabinet c202 = new Cabinet("202",2,665,1020,698,1095);
        array.add(c202);
        Cabinet c202a = new Cabinet("202а",2,728,1020,757,1095);
        array.add(c202a);
        Cabinet c202b = new Cabinet("202б",2,758,1020,787,1095);
        array.add(c202b);
        Cabinet c204 = new Cabinet("204",2,846,1020,872,1095);
        array.add(c204);
        Cabinet c206 = new Cabinet("206",2,1003,906,1094,1095);
        array.add(c206);
        Cabinet c208 = new Cabinet("208",2,1095,1020,1146,1095);
        array.add(c208);
        Cabinet c210 = new Cabinet("210",2,1266,1020,1291,1095);
        array.add(c210);
        Cabinet c212 = new Cabinet("212",2,1292,906,1391,1095);
        array.add(c212);
        Cabinet c214 = new Cabinet("214",2,1392,1020,1486,1095);
        array.add(c214);
        Cabinet c216 = new Cabinet("216",2,1488,1020,1561,1095);
        array.add(c216);
        Cabinet c218 = new Cabinet("218",2,1563,1020,1599,1095);
        array.add(c218);
        Cabinet c220 = new Cabinet("220",2,1600,1020,1627,1095);
        array.add(c220);
        Cabinet c222 = new Cabinet("222",2,1783,1020,1815,1095);
        array.add(c222);

        Cabinet c201 = new Cabinet("201",2,694,1138,727,1211);
        array.add(c201);
        Cabinet c203 = new Cabinet("203",2,728,1138,818,1211);
        array.add(c203);
        Cabinet c205 = new Cabinet("205",2,819,1138,910,1211);
        array.add(c205);
        Cabinet c207 = new Cabinet("207",2,910,1138,977,1211);
        array.add(c207);
        Cabinet c209 = new Cabinet("209",2,977,1138,1002,1211);
        array.add(c209);
        Cabinet c211 = new Cabinet("211",2,1095,1138,1182,1211);
        array.add(c211);
        Cabinet c213 = new Cabinet("213",2,1183,1138,1291,1211);
        array.add(c213);
        Cabinet c215 = new Cabinet("215",2,1392,1138,1452,1211);
        array.add(c215);
        Cabinet c217 = new Cabinet("217",2,1453,1138,1487,1211);
        array.add(c217);
        Cabinet c219 = new Cabinet("219",2,1488,1138,1561,1211);
        array.add(c219);
        Cabinet c221 = new Cabinet("221",2,1562,1138,1599,1211);
        array.add(c221);
        Cabinet c223 = new Cabinet("223",2,1600,1138,1656,1211);
        array.add(c223);
        Cabinet c225 = new Cabinet("225",2,1656,1138,1682,1211);
        array.add(c225);

        Cabinet c200a = new Cabinet("200а",2,347,1135,420,1208);
        array.add(c200a);
        Cabinet c200b = new Cabinet("200б",2,395,1064,468,1095);
        array.add(c200b);
        Cabinet c200g = new Cabinet("200г",2,370,1019,394,1095);
        array.add(c200g);
        Cabinet c200d = new Cabinet("200д",2,347,1019,369,1095);
        array.add(c200d);
        Cabinet c200e = new Cabinet("200е",2,272,1019,346,1134);
        array.add(c200e);

        Cabinet profkom = new Cabinet("профком",2,347,1315,403,1358);
        array.add(profkom);
        Cabinet Profkom = new Cabinet("Профком",2,347,1315,403,1358);
        array.add(Profkom);
        Cabinet telecentr = new Cabinet("телецентр",2,227,1155,347,1208);
        array.add(telecentr);
        Cabinet Telecentr = new Cabinet("Телецентр",2,227,1155,347,1208);
        array.add(Telecentr);
        Cabinet costum = new Cabinet("костюмерная",2,395,239,524,482);
        array.add(costum);
        Cabinet Costum = new Cabinet("Костюмерная",2,395,239,524,482);
        array.add(Costum);
        Cabinet readzal = new Cabinet("читальный зал",2,1683,1212,1762,1364);
        array.add(readzal);
        Cabinet Readzal = new Cabinet("Читальный зал",2,1683,1212,1762,1364);
        array.add(Readzal);
        Cabinet stolovaya = new Cabinet("столовая",2,1754,1019,1783,1096);
        array.add(stolovaya);
        Cabinet Stolovaya = new Cabinet("Столовая",2,1754,1019,1783,1096);
        array.add(Stolovaya);




        ///////ТРЕТИЙ ЭТАЖ/////////
        Cabinet c302 = new Cabinet("302",3,46,287,174,383);
        array.add(c302);
        Cabinet c304 = new Cabinet("304",3,175,287,227,383);
        array.add(c304);
        Cabinet c306 = new Cabinet("306",3,339,287,502,385);
        array.add(c306);
        Cabinet c306a = new Cabinet("306а",3,502,287,550,385);
        array.add(c306a);
        Cabinet c306b = new Cabinet("306б",3,550,287,593,385);
        array.add(c306b);
        Cabinet c308 = new Cabinet("308",3,593,287,782,385);
        array.add(c308);
        Cabinet c310 = new Cabinet("310",3,783,287,888,385);
        array.add(c310);
        Cabinet c312 = new Cabinet("312",3,888,287,940,385);
        array.add(c312);
        Cabinet c314 = new Cabinet("314",3,941,287,1039,385);
        array.add(c314);
        Cabinet c316 = new Cabinet("316",3,1252,287,1337,385);
        array.add(c316);
        Cabinet c318 = new Cabinet("318",3,1539,287,1574,385);
        array.add(c318);
        Cabinet c320 = new Cabinet("320",3,1783,287,1909,385);
        array.add(c320);
        Cabinet c322 = new Cabinet("322",3,1910,287,1991,385);
        array.add(c322);
        Cabinet c324 = new Cabinet("324",3,1991,287,2023,385);
        array.add(c324);
        Cabinet c326 = new Cabinet("326",3,2024,287,2130,385);
        array.add(c326);
        Cabinet c328 = new Cabinet("328",3,2131,287,2160,385);
        array.add(c328);
        Cabinet c330 = new Cabinet("330",3,2354,287,2459,385);
        array.add(c330);

        Cabinet c301 = new Cabinet("301",3,46,451,174,549);
        array.add(c301);
        Cabinet c301a = new Cabinet("301а",3,175,451,227,549);
        array.add(c301a);
        Cabinet c303 = new Cabinet("303",3,227,451,388,549);
        array.add(c303);
        Cabinet c305 = new Cabinet("305",3,502,451,593,549);
        array.add(c305);
        Cabinet c307 = new Cabinet("307",3,593,451,745,549);
        array.add(c307);
        Cabinet c309 = new Cabinet("309",3,745,451,888,549);
        array.add(c309);
        Cabinet c309a = new Cabinet("309а",3,888,451,986,549);
        array.add(c309a);
        Cabinet c311 = new Cabinet("311",3,987,451,1039,549);
        array.add(c311);
        Cabinet c313 = new Cabinet("313",3,1039,451,1195,549);
        array.add(c313);
        Cabinet c315 = new Cabinet("315",3,1195,451,1251,549);
        array.add(c315);
        Cabinet c317 = new Cabinet("317",3,1252,451,1337,549);
        array.add(c317);
        Cabinet c319 = new Cabinet("319",3,1465,451,1574,549);
        array.add(c319);
        Cabinet c321 = new Cabinet("321",3,1574,451,1731,549);
        array.add(c321);
        Cabinet c323 = new Cabinet("323",3,1731,451,1782,549);
        array.add(c323);
        Cabinet c325 = new Cabinet("325",3,1783,451,1821,549);
        array.add(c325);
        Cabinet c327 = new Cabinet("327",3,1821,451,1859,549);
        array.add(c327);
        Cabinet c329 = new Cabinet("329",3,1860,451,1896,549);
        array.add(c329);
        Cabinet c331 = new Cabinet("331",3,1962,451,1991,549);
        array.add(c331);
        Cabinet c333 = new Cabinet("333",3,2024,451,2130,549);
        array.add(c333);
        Cabinet c335 = new Cabinet("335",3,2131,451,2160,549);
        array.add(c335);
        Cabinet c337 = new Cabinet("337",3,2161,451,2225,549);
        array.add(c337);
        Cabinet c339 = new Cabinet("339",3,2225,451,2286,549);
        array.add(c339);
        Cabinet c339a = new Cabinet("339а",3,2287,451,2459,549);
        array.add(c339a);

        ///////ЧЕТВЕРТЫЙ ЭТАЖ/////////
        Cabinet c402 = new Cabinet("402",4,31,215,143,305);
        array.add(c402);
        Cabinet c404 = new Cabinet("404",4,143,215,220,305);
        array.add(c404);
        Cabinet c406 = new Cabinet("406",4,336,215,490,306);
        array.add(c406);
        Cabinet c406a = new Cabinet("406а",4,490,215,550,306);
        array.add(c406a);
        Cabinet c406b = new Cabinet("406б",4,550,215,607,306);
        array.add(c406b);
        Cabinet c408 = new Cabinet("408",4,608,215,767,306);
        array.add(c408);
        Cabinet c410 = new Cabinet("410",4,767,215,868,306);///
        array.add(c410);
        Cabinet c412 = new Cabinet("412",4,868,215,1025,306);
        array.add(c412);
        Cabinet c414 = new Cabinet("414",4,1025,215,1087,306);
        array.add(c414);
        Cabinet c416 = new Cabinet("416",4,1087,215,1243,306);
        array.add(c416);
        Cabinet c418 = new Cabinet("418",4,1243,215,1378,306);
        array.add(c418);
        Cabinet c420 = new Cabinet("420",4,1575,215,1621,306);
        array.add(c420);
        Cabinet c422 = new Cabinet("422",4,1621,215,1731,306);
        array.add(c422);
        Cabinet c424 = new Cabinet("424",4,1731,215,1764,306);//
        array.add(c424);
        Cabinet c426 = new Cabinet("426",4,1764,215,1872,306);//
        array.add(c426);
        Cabinet c428 = new Cabinet("428",4,1872,215,2002,306);//
        array.add(c428);
        Cabinet c430 = new Cabinet("430",4,2002,215,2034,306);
        array.add(c430);
        Cabinet c432 = new Cabinet("432",4,2035,215,2063,306);
        array.add(c432);
        Cabinet c434 = new Cabinet("434",4,2064,215,2146,306);//
        array.add(c434);
        Cabinet c436 = new Cabinet("436",4,2360,215,2470,306);
        array.add(c436);

        Cabinet c401 = new Cabinet("401",4,494,368,651,459);
        array.add(c401);
        Cabinet c403 = new Cabinet("403",4,651,368,713,459);
        array.add(c403);
        Cabinet c405 = new Cabinet("405",4,713,368,868,459);//
        array.add(c405);
        Cabinet c407 = new Cabinet("407",4,983,368,1025,459);//
        array.add(c407);
        Cabinet c409 = new Cabinet("409",4,1025,368,1197,459);
        array.add(c409);
        Cabinet c411 = new Cabinet("411",4,1197,368,1243,459);
        array.add(c411);
        Cabinet c413 = new Cabinet("413",4,1243,368,1378,459);
        array.add(c413);
        Cabinet c413a = new Cabinet("413а",4,1378,368,1510,459);
        array.add(c413a);
        Cabinet c415 = new Cabinet("415",4,1511,368,1620,459);
        array.add(c415);
        Cabinet c417 = new Cabinet("417",4,1621,368,1731,459);
        array.add(c417);
        Cabinet c419 = new Cabinet("419",4,1731,368,1763,459);//
        array.add(c419);
        Cabinet c421 = new Cabinet("421",4,1763,368,1872,459);
        array.add(c421);
        Cabinet c423 = new Cabinet("423",4,1949,368,2034,459);//
        array.add(c423);
        Cabinet c425 = new Cabinet("425",4,2033,368,2114,459);
        array.add(c425);
        Cabinet c427 = new Cabinet("427",4,2114,368,2226,459);//
        array.add(c427);
        Cabinet c427a = new Cabinet("427а",4,2226,368,2294,459);
        array.add(c427a);
        Cabinet c427b = new Cabinet("427б",4,2295,368,2360,459);
        array.add(c427b);
        Cabinet c429 = new Cabinet("429",4,2360,368,2470,459);
        array.add(c429);

        Cabinet bm = new Cabinet("биологический музей",4,31,368,340,459);
        array.add(bm);
        Cabinet Bm = new Cabinet("Биологический музей",4,31,368,340,459);
        array.add(Bm);
        Cabinet Zhu = new Cabinet("Живой уголок",4,867,368,984,460);
        array.add(Zhu);
        Cabinet zhu = new Cabinet("живой уголок",4,867,368,984,460);
        array.add(zhu);

        ///////ПЯИЫЙ ЭТАЖ/////////
        Cabinet c502 = new Cabinet("502",5,40,257,168,354);
        array.add(c502);
        Cabinet c504 = new Cabinet("504",5,169,257,221,354);
        array.add(c504);
        Cabinet c506 = new Cabinet("506",5,334,257,389,354);
        array.add(c506);
        Cabinet c508 = new Cabinet("508",5,389,257,445,354);//
        array.add(c508);
        Cabinet c510 = new Cabinet("510",5,446,257,497,354);
        array.add(c510);
        Cabinet c510a = new Cabinet("510а",5,498,257,540,354);//
        array.add(c510a);
        Cabinet c510b = new Cabinet("510б",5,541,257,589,354);
        array.add(c510b);
        Cabinet c512 = new Cabinet("512",5,589,257,742,354);
        array.add(c512);
        Cabinet c514 = new Cabinet("514",5,742,257,898,354);//
        array.add(c514);
        Cabinet c516 = new Cabinet("516",5,899,257,1018,354);
        array.add(c516);
        Cabinet c518 = new Cabinet("518",5,1018,257,1181,354);//
        array.add(c518);
        Cabinet c520 = new Cabinet("520",5,1182,257,1233,354);//
        array.add(c520);
        Cabinet c522 = new Cabinet("522",5,1234,257,1337,354);
        array.add(c522);
        Cabinet c524 = new Cabinet("524",5,1535,257,1571,354);
        array.add(c524);
        Cabinet c526 = new Cabinet("526",5,1571,257,1731,354);
        array.add(c526);
        Cabinet c528 = new Cabinet("528",5,1731,257,1844,354);
        array.add(c528);
        Cabinet c530 = new Cabinet("530",5,1845,257,1978,354);
        array.add(c530);
        Cabinet c532 = new Cabinet("532",5,1978,257,2019,354);
        array.add(c532);
        Cabinet c534 = new Cabinet("534",5,2019,257,2162,354);
        array.add(c534);
        Cabinet c536 = new Cabinet("536",5,2358,257,2463,354);
        array.add(c536);

        Cabinet c501 = new Cabinet("501",5,40,421,114,520);
        array.add(c501);
        Cabinet c501a = new Cabinet("501а",5,114,421,169,520);
        array.add(c501a);
        Cabinet c505 = new Cabinet("505",5,498,421,624,520);
        array.add(c505);
        Cabinet c507 = new Cabinet("507",5,624,421,688,520);
        array.add(c507);
        Cabinet c509 = new Cabinet("509",5,688,421,849,520);
        array.add(c509);
        Cabinet c509a = new Cabinet("509а",5,849,421,960,520);
        array.add(c509a);
        Cabinet c511 = new Cabinet("511",5,960,421,1018,520);
        array.add(c511);
        Cabinet c513 = new Cabinet("513",5,1018,421,1181,520);
        array.add(c513);
        Cabinet c515 = new Cabinet("515",5,1182,421,1233,520);
        array.add(c515);
        Cabinet c517 = new Cabinet("517",5,1234,421,1337,520);
        array.add(c517);
        Cabinet c517a = new Cabinet("517а",5,1337,421,1401,520);
        array.add(c517a);
        Cabinet c517b = new Cabinet("517б",5,1401,421,1465,520);
        array.add(c517b);
        Cabinet c519 = new Cabinet("519",5,1465,421,1571,520);
        array.add(c519);
        Cabinet c521 = new Cabinet("521",5,1571,421,1686,520);
        array.add(c521);
        Cabinet c523 = new Cabinet("523",5,1687,421,1731,520);
        array.add(c523);
        Cabinet c525 = new Cabinet("525",5,1731,421,1844,520);
        array.add(c525);
        Cabinet c527 = new Cabinet("527",5,1934,421,1978,520);
        array.add(c527);
        Cabinet c529 = new Cabinet("529",5,1978,421,2019,520);
        array.add(c529);
        Cabinet c531 = new Cabinet("531",5,2019,421,2121,520);
        array.add(c531);
        Cabinet c533 = new Cabinet("533",5,2122,421,2228,520);
        array.add(c533);
        Cabinet c535 = new Cabinet("535",5,2229,421,2292,520);
        array.add(c535);
        Cabinet c537 = new Cabinet("537",5,2293,421,2357,520);
        array.add(c537);
        Cabinet c539 = new Cabinet("539",5,2358,421,2463,520);
        array.add(c539);

        Cabinet Lm = new Cabinet("Литературный музей",5,222,421,389,520);
        array.add(Lm);
        Cabinet lm = new Cabinet("литературный музей",5,222,421,389,520);
        array.add(lm);



        ///////ШЕСТОЙ ЭТАЖ/////////
        Cabinet c602 = new Cabinet("602",6,52,271,138,367);
        array.add(c602);
        Cabinet c604 = new Cabinet("604",6,180,271,233,367);
        array.add(c604);
        Cabinet c606 = new Cabinet("606",6,343,271,505,367);
        array.add(c606);
        Cabinet c606a = new Cabinet("606а",6,505,271,553,367);
        array.add(c606a);
        Cabinet c606b = new Cabinet("606б",6,553,271,602,367);
        array.add(c606b);
        Cabinet c608 = new Cabinet("608",6,602,271,690,367);
        array.add(c608);
        Cabinet c610 = new Cabinet("610",6,740,271,859,367);
        array.add(c610);
        Cabinet c612 = new Cabinet("612",6,859,271,1009,367);
        array.add(c612);
        Cabinet c612a = new Cabinet("612а",6,1009,271,1189,367);
        array.add(c612a);
        Cabinet c614 = new Cabinet("614",6,1258,271,1335,367);//
        array.add(c614);
        Cabinet c616 = new Cabinet("616",6,1524,271,1554,367);
        array.add(c616);
        Cabinet c618 = new Cabinet("618",6,1554,271,1591,367);
        array.add(c618);
        Cabinet c620 = new Cabinet("620",6,1591,271,1719,367);
        array.add(c620);
        Cabinet c622 = new Cabinet("622",6,1719,271,1821,367);
        array.add(c622);
        Cabinet c624 = new Cabinet("624",6,1821,271,1935,367);
        array.add(c624);
        Cabinet c626 = new Cabinet("626",6,1935,271,1983,367);
        array.add(c626);
        Cabinet c628 = new Cabinet("628",6,1983,271,2022,367);
        array.add(c628);
        Cabinet c630 = new Cabinet("630",6,2022,271,2154,367);//
        array.add(c630);
        Cabinet c632 = new Cabinet("632",6,2345,271,2451,367);
        array.add(c632);

        Cabinet c601 = new Cabinet("601",6,52,434,180,531);
        array.add(c601);
        Cabinet c603 = new Cabinet("603",6,180,434,232,531);
        array.add(c603);
        Cabinet c605 = new Cabinet("605",6,505,434,648,531);
        array.add(c605);
        Cabinet c607 = new Cabinet("607",6,648,434,859,531);
        array.add(c607);
        Cabinet c607a = new Cabinet("607а",6,859,434,962,531);
        array.add(c607a);
        Cabinet c609 = new Cabinet("609",6,962,434,1009,531);
        array.add(c609);
        Cabinet c611 = new Cabinet("611",6,1009,434,1258,531);
        array.add(c611);
        Cabinet c613 = new Cabinet("613",6,1258,434,1336,531);
        array.add(c613);
        Cabinet c615 = new Cabinet("615",6,1462,434,1554,531);
        array.add(c615);
        Cabinet c617 = new Cabinet("617",6,1554,434,1719,531);//
        array.add(c617);
        Cabinet c619 = new Cabinet("619",6,1718,434,1821,531);
        array.add(c619);
        Cabinet c621 = new Cabinet("621",6,1897,434,1935,531);
        array.add(c621);
        Cabinet c623 = new Cabinet("623",6,1935,434,1983,531);
        array.add(c623);
        Cabinet c625 = new Cabinet("625",6,1983,434,2087,531);
        array.add(c625);
        Cabinet c627 = new Cabinet("627",6,2087,434,2218,531);
        array.add(c627);
        Cabinet c629a = new Cabinet("629а",6,2218,434,2345,531);
        array.add(c629a);
        Cabinet c629 = new Cabinet("629",6,2345,434,2451,531);
        array.add(c629);

    }
}


