package leetcode.problem_0247;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findStrobogrammatic_1() {
        final int n = 0;

        final List<String> result = solution.findStrobogrammatic(n);

        assertTrue(ListUtils.areEqual(Collections.singletonList(""), result));
    }

    @Test
    public void findStrobogrammatic_2() {
        final int n = 1;

        final List<String> result = solution.findStrobogrammatic(n);

        assertTrue(ListUtils.areEqual(Arrays.asList("0", "1", "8"), result));
    }

    @Test
    public void findStrobogrammatic_3() {
        final int n = 2;

        final List<String> result = solution.findStrobogrammatic(n);

        assertTrue(ListUtils.areEqual(Arrays.asList("11", "69", "88", "96"), result));
    }

    @Test
    public void findStrobogrammatic_4() {
        final int n = 10;

        final List<String> result = solution.findStrobogrammatic(n);

        assertTrue(ListUtils.areEqual(Arrays.asList("1000000001", "6000000009", "8000000008", "9000000006", "1100000011", "6100000019", "8100000018", "9100000016", "1600000091", "6600000099", "8600000098", "9600000096", "1800000081", "6800000089", "8800000088", "9800000086", "1900000061", "6900000069", "8900000068", "9900000066", "1010000101", "6010000109", "8010000108", "9010000106", "1110000111", "6110000119", "8110000118", "9110000116", "1610000191", "6610000199", "8610000198", "9610000196", "1810000181", "6810000189", "8810000188", "9810000186", "1910000161", "6910000169", "8910000168", "9910000166", "1060000901", "6060000909", "8060000908", "9060000906", "1160000911", "6160000919", "8160000918", "9160000916", "1660000991", "6660000999", "8660000998", "9660000996", "1860000981", "6860000989", "8860000988", "9860000986", "1960000961", "6960000969", "8960000968", "9960000966", "1080000801", "6080000809", "8080000808", "9080000806", "1180000811", "6180000819", "8180000818", "9180000816", "1680000891", "6680000899", "8680000898", "9680000896", "1880000881", "6880000889", "8880000888", "9880000886", "1980000861", "6980000869", "8980000868", "9980000866", "1090000601", "6090000609", "8090000608", "9090000606", "1190000611", "6190000619", "8190000618", "9190000616", "1690000691", "6690000699", "8690000698", "9690000696", "1890000681", "6890000689", "8890000688", "9890000686", "1990000661", "6990000669", "8990000668", "9990000666", "1001001001", "6001001009", "8001001008", "9001001006", "1101001011", "6101001019", "8101001018", "9101001016", "1601001091", "6601001099", "8601001098", "9601001096", "1801001081", "6801001089", "8801001088", "9801001086", "1901001061", "6901001069", "8901001068", "9901001066", "1011001101", "6011001109", "8011001108", "9011001106", "1111001111", "6111001119", "8111001118", "9111001116", "1611001191", "6611001199", "8611001198", "9611001196", "1811001181", "6811001189", "8811001188", "9811001186", "1911001161", "6911001169", "8911001168", "9911001166", "1061001901", "6061001909", "8061001908", "9061001906", "1161001911", "6161001919", "8161001918", "9161001916", "1661001991", "6661001999", "8661001998", "9661001996", "1861001981", "6861001989", "8861001988", "9861001986", "1961001961", "6961001969", "8961001968", "9961001966", "1081001801", "6081001809", "8081001808", "9081001806", "1181001811", "6181001819", "8181001818", "9181001816", "1681001891", "6681001899", "8681001898", "9681001896", "1881001881", "6881001889", "8881001888", "9881001886", "1981001861", "6981001869", "8981001868", "9981001866", "1091001601", "6091001609", "8091001608", "9091001606", "1191001611", "6191001619", "8191001618", "9191001616", "1691001691", "6691001699", "8691001698", "9691001696", "1891001681", "6891001689", "8891001688", "9891001686", "1991001661", "6991001669", "8991001668", "9991001666", "1006009001", "6006009009", "8006009008", "9006009006", "1106009011", "6106009019", "8106009018", "9106009016", "1606009091", "6606009099", "8606009098", "9606009096", "1806009081", "6806009089", "8806009088", "9806009086", "1906009061", "6906009069", "8906009068", "9906009066", "1016009101", "6016009109", "8016009108", "9016009106", "1116009111", "6116009119", "8116009118", "9116009116", "1616009191", "6616009199", "8616009198", "9616009196", "1816009181", "6816009189", "8816009188", "9816009186", "1916009161", "6916009169", "8916009168", "9916009166", "1066009901", "6066009909", "8066009908", "9066009906", "1166009911", "6166009919", "8166009918", "9166009916", "1666009991", "6666009999", "8666009998", "9666009996", "1866009981", "6866009989", "8866009988", "9866009986", "1966009961", "6966009969", "8966009968", "9966009966", "1086009801", "6086009809", "8086009808", "9086009806", "1186009811", "6186009819", "8186009818", "9186009816", "1686009891", "6686009899", "8686009898", "9686009896", "1886009881", "6886009889", "8886009888", "9886009886", "1986009861", "6986009869", "8986009868", "9986009866", "1096009601", "6096009609", "8096009608", "9096009606", "1196009611", "6196009619", "8196009618", "9196009616", "1696009691", "6696009699", "8696009698", "9696009696", "1896009681", "6896009689", "8896009688", "9896009686", "1996009661", "6996009669", "8996009668", "9996009666", "1008008001", "6008008009", "8008008008", "9008008006", "1108008011", "6108008019", "8108008018", "9108008016", "1608008091", "6608008099", "8608008098", "9608008096", "1808008081", "6808008089", "8808008088", "9808008086", "1908008061", "6908008069", "8908008068", "9908008066", "1018008101", "6018008109", "8018008108", "9018008106", "1118008111", "6118008119", "8118008118", "9118008116", "1618008191", "6618008199", "8618008198", "9618008196", "1818008181", "6818008189", "8818008188", "9818008186", "1918008161", "6918008169", "8918008168", "9918008166", "1068008901", "6068008909", "8068008908", "9068008906", "1168008911", "6168008919", "8168008918", "9168008916", "1668008991", "6668008999", "8668008998", "9668008996", "1868008981", "6868008989", "8868008988", "9868008986", "1968008961", "6968008969", "8968008968", "9968008966", "1088008801", "6088008809", "8088008808", "9088008806", "1188008811", "6188008819", "8188008818", "9188008816", "1688008891", "6688008899", "8688008898", "9688008896", "1888008881", "6888008889", "8888008888", "9888008886", "1988008861", "6988008869", "8988008868", "9988008866", "1098008601", "6098008609", "8098008608", "9098008606", "1198008611", "6198008619", "8198008618", "9198008616", "1698008691", "6698008699", "8698008698", "9698008696", "1898008681", "6898008689", "8898008688", "9898008686", "1998008661", "6998008669", "8998008668", "9998008666", "1009006001", "6009006009", "8009006008", "9009006006", "1109006011", "6109006019", "8109006018", "9109006016", "1609006091", "6609006099", "8609006098", "9609006096", "1809006081", "6809006089", "8809006088", "9809006086", "1909006061", "6909006069", "8909006068", "9909006066", "1019006101", "6019006109", "8019006108", "9019006106", "1119006111", "6119006119", "8119006118", "9119006116", "1619006191", "6619006199", "8619006198", "9619006196", "1819006181", "6819006189", "8819006188", "9819006186", "1919006161", "6919006169", "8919006168", "9919006166", "1069006901", "6069006909", "8069006908", "9069006906", "1169006911", "6169006919", "8169006918", "9169006916", "1669006991", "6669006999", "8669006998", "9669006996", "1869006981", "6869006989", "8869006988", "9869006986", "1969006961", "6969006969", "8969006968", "9969006966", "1089006801", "6089006809", "8089006808", "9089006806", "1189006811", "6189006819", "8189006818", "9189006816", "1689006891", "6689006899", "8689006898", "9689006896", "1889006881", "6889006889", "8889006888", "9889006886", "1989006861", "6989006869", "8989006868", "9989006866", "1099006601", "6099006609", "8099006608", "9099006606", "1199006611", "6199006619", "8199006618", "9199006616", "1699006691", "6699006699", "8699006698", "9699006696", "1899006681", "6899006689", "8899006688", "9899006686", "1999006661", "6999006669", "8999006668", "9999006666", "1000110001", "6000110009", "8000110008", "9000110006", "1100110011", "6100110019", "8100110018", "9100110016", "1600110091", "6600110099", "8600110098", "9600110096", "1800110081", "6800110089", "8800110088", "9800110086", "1900110061", "6900110069", "8900110068", "9900110066", "1010110101", "6010110109", "8010110108", "9010110106", "1110110111", "6110110119", "8110110118", "9110110116", "1610110191", "6610110199", "8610110198", "9610110196", "1810110181", "6810110189", "8810110188", "9810110186", "1910110161", "6910110169", "8910110168", "9910110166", "1060110901", "6060110909", "8060110908", "9060110906", "1160110911", "6160110919", "8160110918", "9160110916", "1660110991", "6660110999", "8660110998", "9660110996", "1860110981", "6860110989", "8860110988", "9860110986", "1960110961", "6960110969", "8960110968", "9960110966", "1080110801", "6080110809", "8080110808", "9080110806", "1180110811", "6180110819", "8180110818", "9180110816", "1680110891", "6680110899", "8680110898", "9680110896", "1880110881", "6880110889", "8880110888", "9880110886", "1980110861", "6980110869", "8980110868", "9980110866", "1090110601", "6090110609", "8090110608", "9090110606", "1190110611", "6190110619", "8190110618", "9190110616", "1690110691", "6690110699", "8690110698", "9690110696", "1890110681", "6890110689", "8890110688", "9890110686", "1990110661", "6990110669", "8990110668", "9990110666", "1001111001", "6001111009", "8001111008", "9001111006", "1101111011", "6101111019", "8101111018", "9101111016", "1601111091", "6601111099", "8601111098", "9601111096", "1801111081", "6801111089", "8801111088", "9801111086", "1901111061", "6901111069", "8901111068", "9901111066", "1011111101", "6011111109", "8011111108", "9011111106", "1111111111", "6111111119", "8111111118", "9111111116", "1611111191", "6611111199", "8611111198", "9611111196", "1811111181", "6811111189", "8811111188", "9811111186", "1911111161", "6911111169", "8911111168", "9911111166", "1061111901", "6061111909", "8061111908", "9061111906", "1161111911", "6161111919", "8161111918", "9161111916", "1661111991", "6661111999", "8661111998", "9661111996", "1861111981", "6861111989", "8861111988", "9861111986", "1961111961", "6961111969", "8961111968", "9961111966", "1081111801", "6081111809", "8081111808", "9081111806", "1181111811", "6181111819", "8181111818", "9181111816", "1681111891", "6681111899", "8681111898", "9681111896", "1881111881", "6881111889", "8881111888", "9881111886", "1981111861", "6981111869", "8981111868", "9981111866", "1091111601", "6091111609", "8091111608", "9091111606", "1191111611", "6191111619", "8191111618", "9191111616", "1691111691", "6691111699", "8691111698", "9691111696", "1891111681", "6891111689", "8891111688", "9891111686", "1991111661", "6991111669", "8991111668", "9991111666", "1006119001", "6006119009", "8006119008", "9006119006", "1106119011", "6106119019", "8106119018", "9106119016", "1606119091", "6606119099", "8606119098", "9606119096", "1806119081", "6806119089", "8806119088", "9806119086", "1906119061", "6906119069", "8906119068", "9906119066", "1016119101", "6016119109", "8016119108", "9016119106", "1116119111", "6116119119", "8116119118", "9116119116", "1616119191", "6616119199", "8616119198", "9616119196", "1816119181", "6816119189", "8816119188", "9816119186", "1916119161", "6916119169", "8916119168", "9916119166", "1066119901", "6066119909", "8066119908", "9066119906", "1166119911", "6166119919", "8166119918", "9166119916", "1666119991", "6666119999", "8666119998", "9666119996", "1866119981", "6866119989", "8866119988", "9866119986", "1966119961", "6966119969", "8966119968", "9966119966", "1086119801", "6086119809", "8086119808", "9086119806", "1186119811", "6186119819", "8186119818", "9186119816", "1686119891", "6686119899", "8686119898", "9686119896", "1886119881", "6886119889", "8886119888", "9886119886", "1986119861", "6986119869", "8986119868", "9986119866", "1096119601", "6096119609", "8096119608", "9096119606", "1196119611", "6196119619", "8196119618", "9196119616", "1696119691", "6696119699", "8696119698", "9696119696", "1896119681", "6896119689", "8896119688", "9896119686", "1996119661", "6996119669", "8996119668", "9996119666", "1008118001", "6008118009", "8008118008", "9008118006", "1108118011", "6108118019", "8108118018", "9108118016", "1608118091", "6608118099", "8608118098", "9608118096", "1808118081", "6808118089", "8808118088", "9808118086", "1908118061", "6908118069", "8908118068", "9908118066", "1018118101", "6018118109", "8018118108", "9018118106", "1118118111", "6118118119", "8118118118", "9118118116", "1618118191", "6618118199", "8618118198", "9618118196", "1818118181", "6818118189", "8818118188", "9818118186", "1918118161", "6918118169", "8918118168", "9918118166", "1068118901", "6068118909", "8068118908", "9068118906", "1168118911", "6168118919", "8168118918", "9168118916", "1668118991", "6668118999", "8668118998", "9668118996", "1868118981", "6868118989", "8868118988", "9868118986", "1968118961", "6968118969", "8968118968", "9968118966", "1088118801", "6088118809", "8088118808", "9088118806", "1188118811", "6188118819", "8188118818", "9188118816", "1688118891", "6688118899", "8688118898", "9688118896", "1888118881", "6888118889", "8888118888", "9888118886", "1988118861", "6988118869", "8988118868", "9988118866", "1098118601", "6098118609", "8098118608", "9098118606", "1198118611", "6198118619", "8198118618", "9198118616", "1698118691", "6698118699", "8698118698", "9698118696", "1898118681", "6898118689", "8898118688", "9898118686", "1998118661", "6998118669", "8998118668", "9998118666", "1009116001", "6009116009", "8009116008", "9009116006", "1109116011", "6109116019", "8109116018", "9109116016", "1609116091", "6609116099", "8609116098", "9609116096", "1809116081", "6809116089", "8809116088", "9809116086", "1909116061", "6909116069", "8909116068", "9909116066", "1019116101", "6019116109", "8019116108", "9019116106", "1119116111", "6119116119", "8119116118", "9119116116", "1619116191", "6619116199", "8619116198", "9619116196", "1819116181", "6819116189", "8819116188", "9819116186", "1919116161", "6919116169", "8919116168", "9919116166", "1069116901", "6069116909", "8069116908", "9069116906", "1169116911", "6169116919", "8169116918", "9169116916", "1669116991", "6669116999", "8669116998", "9669116996", "1869116981", "6869116989", "8869116988", "9869116986", "1969116961", "6969116969", "8969116968", "9969116966", "1089116801", "6089116809", "8089116808", "9089116806", "1189116811", "6189116819", "8189116818", "9189116816", "1689116891", "6689116899", "8689116898", "9689116896", "1889116881", "6889116889", "8889116888", "9889116886", "1989116861", "6989116869", "8989116868", "9989116866", "1099116601", "6099116609", "8099116608", "9099116606", "1199116611", "6199116619", "8199116618", "9199116616", "1699116691", "6699116699", "8699116698", "9699116696", "1899116681", "6899116689", "8899116688", "9899116686", "1999116661", "6999116669", "8999116668", "9999116666", "1000690001", "6000690009", "8000690008", "9000690006", "1100690011", "6100690019", "8100690018", "9100690016", "1600690091", "6600690099", "8600690098", "9600690096", "1800690081", "6800690089", "8800690088", "9800690086", "1900690061", "6900690069", "8900690068", "9900690066", "1010690101", "6010690109", "8010690108", "9010690106", "1110690111", "6110690119", "8110690118", "9110690116", "1610690191", "6610690199", "8610690198", "9610690196", "1810690181", "6810690189", "8810690188", "9810690186", "1910690161", "6910690169", "8910690168", "9910690166", "1060690901", "6060690909", "8060690908", "9060690906", "1160690911", "6160690919", "8160690918", "9160690916", "1660690991", "6660690999", "8660690998", "9660690996", "1860690981", "6860690989", "8860690988", "9860690986", "1960690961", "6960690969", "8960690968", "9960690966", "1080690801", "6080690809", "8080690808", "9080690806", "1180690811", "6180690819", "8180690818", "9180690816", "1680690891", "6680690899", "8680690898", "9680690896", "1880690881", "6880690889", "8880690888", "9880690886", "1980690861", "6980690869", "8980690868", "9980690866", "1090690601", "6090690609", "8090690608", "9090690606", "1190690611", "6190690619", "8190690618", "9190690616", "1690690691", "6690690699", "8690690698", "9690690696", "1890690681", "6890690689", "8890690688", "9890690686", "1990690661", "6990690669", "8990690668", "9990690666", "1001691001", "6001691009", "8001691008", "9001691006", "1101691011", "6101691019", "8101691018", "9101691016", "1601691091", "6601691099", "8601691098", "9601691096", "1801691081", "6801691089", "8801691088", "9801691086", "1901691061", "6901691069", "8901691068", "9901691066", "1011691101", "6011691109", "8011691108", "9011691106", "1111691111", "6111691119", "8111691118", "9111691116", "1611691191", "6611691199", "8611691198", "9611691196", "1811691181", "6811691189", "8811691188", "9811691186", "1911691161", "6911691169", "8911691168", "9911691166", "1061691901", "6061691909", "8061691908", "9061691906", "1161691911", "6161691919", "8161691918", "9161691916", "1661691991", "6661691999", "8661691998", "9661691996", "1861691981", "6861691989", "8861691988", "9861691986", "1961691961", "6961691969", "8961691968", "9961691966", "1081691801", "6081691809", "8081691808", "9081691806", "1181691811", "6181691819", "8181691818", "9181691816", "1681691891", "6681691899", "8681691898", "9681691896", "1881691881", "6881691889", "8881691888", "9881691886", "1981691861", "6981691869", "8981691868", "9981691866", "1091691601", "6091691609", "8091691608", "9091691606", "1191691611", "6191691619", "8191691618", "9191691616", "1691691691", "6691691699", "8691691698", "9691691696", "1891691681", "6891691689", "8891691688", "9891691686", "1991691661", "6991691669", "8991691668", "9991691666", "1006699001", "6006699009", "8006699008", "9006699006", "1106699011", "6106699019", "8106699018", "9106699016", "1606699091", "6606699099", "8606699098", "9606699096", "1806699081", "6806699089", "8806699088", "9806699086", "1906699061", "6906699069", "8906699068", "9906699066", "1016699101", "6016699109", "8016699108", "9016699106", "1116699111", "6116699119", "8116699118", "9116699116", "1616699191", "6616699199", "8616699198", "9616699196", "1816699181", "6816699189", "8816699188", "9816699186", "1916699161", "6916699169", "8916699168", "9916699166", "1066699901", "6066699909", "8066699908", "9066699906", "1166699911", "6166699919", "8166699918", "9166699916", "1666699991", "6666699999", "8666699998", "9666699996", "1866699981", "6866699989", "8866699988", "9866699986", "1966699961", "6966699969", "8966699968", "9966699966", "1086699801", "6086699809", "8086699808", "9086699806", "1186699811", "6186699819", "8186699818", "9186699816", "1686699891", "6686699899", "8686699898", "9686699896", "1886699881", "6886699889", "8886699888", "9886699886", "1986699861", "6986699869", "8986699868", "9986699866", "1096699601", "6096699609", "8096699608", "9096699606", "1196699611", "6196699619", "8196699618", "9196699616", "1696699691", "6696699699", "8696699698", "9696699696", "1896699681", "6896699689", "8896699688", "9896699686", "1996699661", "6996699669", "8996699668", "9996699666", "1008698001", "6008698009", "8008698008", "9008698006", "1108698011", "6108698019", "8108698018", "9108698016", "1608698091", "6608698099", "8608698098", "9608698096", "1808698081", "6808698089", "8808698088", "9808698086", "1908698061", "6908698069", "8908698068", "9908698066", "1018698101", "6018698109", "8018698108", "9018698106", "1118698111", "6118698119", "8118698118", "9118698116", "1618698191", "6618698199", "8618698198", "9618698196", "1818698181", "6818698189", "8818698188", "9818698186", "1918698161", "6918698169", "8918698168", "9918698166", "1068698901", "6068698909", "8068698908", "9068698906", "1168698911", "6168698919", "8168698918", "9168698916", "1668698991", "6668698999", "8668698998", "9668698996", "1868698981", "6868698989", "8868698988", "9868698986", "1968698961", "6968698969", "8968698968", "9968698966", "1088698801", "6088698809", "8088698808", "9088698806", "1188698811", "6188698819", "8188698818", "9188698816", "1688698891", "6688698899", "8688698898", "9688698896", "1888698881", "6888698889", "8888698888", "9888698886", "1988698861", "6988698869", "8988698868", "9988698866", "1098698601", "6098698609", "8098698608", "9098698606", "1198698611", "6198698619", "8198698618", "9198698616", "1698698691", "6698698699", "8698698698", "9698698696", "1898698681", "6898698689", "8898698688", "9898698686", "1998698661", "6998698669", "8998698668", "9998698666", "1009696001", "6009696009", "8009696008", "9009696006", "1109696011", "6109696019", "8109696018", "9109696016", "1609696091", "6609696099", "8609696098", "9609696096", "1809696081", "6809696089", "8809696088", "9809696086", "1909696061", "6909696069", "8909696068", "9909696066", "1019696101", "6019696109", "8019696108", "9019696106", "1119696111", "6119696119", "8119696118", "9119696116", "1619696191", "6619696199", "8619696198", "9619696196", "1819696181", "6819696189", "8819696188", "9819696186", "1919696161", "6919696169", "8919696168", "9919696166", "1069696901", "6069696909", "8069696908", "9069696906", "1169696911", "6169696919", "8169696918", "9169696916", "1669696991", "6669696999", "8669696998", "9669696996", "1869696981", "6869696989", "8869696988", "9869696986", "1969696961", "6969696969", "8969696968", "9969696966", "1089696801", "6089696809", "8089696808", "9089696806", "1189696811", "6189696819", "8189696818", "9189696816", "1689696891", "6689696899", "8689696898", "9689696896", "1889696881", "6889696889", "8889696888", "9889696886", "1989696861", "6989696869", "8989696868", "9989696866", "1099696601", "6099696609", "8099696608", "9099696606", "1199696611", "6199696619", "8199696618", "9199696616", "1699696691", "6699696699", "8699696698", "9699696696", "1899696681", "6899696689", "8899696688", "9899696686", "1999696661", "6999696669", "8999696668", "9999696666", "1000880001", "6000880009", "8000880008", "9000880006", "1100880011", "6100880019", "8100880018", "9100880016", "1600880091", "6600880099", "8600880098", "9600880096", "1800880081", "6800880089", "8800880088", "9800880086", "1900880061", "6900880069", "8900880068", "9900880066", "1010880101", "6010880109", "8010880108", "9010880106", "1110880111", "6110880119", "8110880118", "9110880116", "1610880191", "6610880199", "8610880198", "9610880196", "1810880181", "6810880189", "8810880188", "9810880186", "1910880161", "6910880169", "8910880168", "9910880166", "1060880901", "6060880909", "8060880908", "9060880906", "1160880911", "6160880919", "8160880918", "9160880916", "1660880991", "6660880999", "8660880998", "9660880996", "1860880981", "6860880989", "8860880988", "9860880986", "1960880961", "6960880969", "8960880968", "9960880966", "1080880801", "6080880809", "8080880808", "9080880806", "1180880811", "6180880819", "8180880818", "9180880816", "1680880891", "6680880899", "8680880898", "9680880896", "1880880881", "6880880889", "8880880888", "9880880886", "1980880861", "6980880869", "8980880868", "9980880866", "1090880601", "6090880609", "8090880608", "9090880606", "1190880611", "6190880619", "8190880618", "9190880616", "1690880691", "6690880699", "8690880698", "9690880696", "1890880681", "6890880689", "8890880688", "9890880686", "1990880661", "6990880669", "8990880668", "9990880666", "1001881001", "6001881009", "8001881008", "9001881006", "1101881011", "6101881019", "8101881018", "9101881016", "1601881091", "6601881099", "8601881098", "9601881096", "1801881081", "6801881089", "8801881088", "9801881086", "1901881061", "6901881069", "8901881068", "9901881066", "1011881101", "6011881109", "8011881108", "9011881106", "1111881111", "6111881119", "8111881118", "9111881116", "1611881191", "6611881199", "8611881198", "9611881196", "1811881181", "6811881189", "8811881188", "9811881186", "1911881161", "6911881169", "8911881168", "9911881166", "1061881901", "6061881909", "8061881908", "9061881906", "1161881911", "6161881919", "8161881918", "9161881916", "1661881991", "6661881999", "8661881998", "9661881996", "1861881981", "6861881989", "8861881988", "9861881986", "1961881961", "6961881969", "8961881968", "9961881966", "1081881801", "6081881809", "8081881808", "9081881806", "1181881811", "6181881819", "8181881818", "9181881816", "1681881891", "6681881899", "8681881898", "9681881896", "1881881881", "6881881889", "8881881888", "9881881886", "1981881861", "6981881869", "8981881868", "9981881866", "1091881601", "6091881609", "8091881608", "9091881606", "1191881611", "6191881619", "8191881618", "9191881616", "1691881691", "6691881699", "8691881698", "9691881696", "1891881681", "6891881689", "8891881688", "9891881686", "1991881661", "6991881669", "8991881668", "9991881666", "1006889001", "6006889009", "8006889008", "9006889006", "1106889011", "6106889019", "8106889018", "9106889016", "1606889091", "6606889099", "8606889098", "9606889096", "1806889081", "6806889089", "8806889088", "9806889086", "1906889061", "6906889069", "8906889068", "9906889066", "1016889101", "6016889109", "8016889108", "9016889106", "1116889111", "6116889119", "8116889118", "9116889116", "1616889191", "6616889199", "8616889198", "9616889196", "1816889181", "6816889189", "8816889188", "9816889186", "1916889161", "6916889169", "8916889168", "9916889166", "1066889901", "6066889909", "8066889908", "9066889906", "1166889911", "6166889919", "8166889918", "9166889916", "1666889991", "6666889999", "8666889998", "9666889996", "1866889981", "6866889989", "8866889988", "9866889986", "1966889961", "6966889969", "8966889968", "9966889966", "1086889801", "6086889809", "8086889808", "9086889806", "1186889811", "6186889819", "8186889818", "9186889816", "1686889891", "6686889899", "8686889898", "9686889896", "1886889881", "6886889889", "8886889888", "9886889886", "1986889861", "6986889869", "8986889868", "9986889866", "1096889601", "6096889609", "8096889608", "9096889606", "1196889611", "6196889619", "8196889618", "9196889616", "1696889691", "6696889699", "8696889698", "9696889696", "1896889681", "6896889689", "8896889688", "9896889686", "1996889661", "6996889669", "8996889668", "9996889666", "1008888001", "6008888009", "8008888008", "9008888006", "1108888011", "6108888019", "8108888018", "9108888016", "1608888091", "6608888099", "8608888098", "9608888096", "1808888081", "6808888089", "8808888088", "9808888086", "1908888061", "6908888069", "8908888068", "9908888066", "1018888101", "6018888109", "8018888108", "9018888106", "1118888111", "6118888119", "8118888118", "9118888116", "1618888191", "6618888199", "8618888198", "9618888196", "1818888181", "6818888189", "8818888188", "9818888186", "1918888161", "6918888169", "8918888168", "9918888166", "1068888901", "6068888909", "8068888908", "9068888906", "1168888911", "6168888919", "8168888918", "9168888916", "1668888991", "6668888999", "8668888998", "9668888996", "1868888981", "6868888989", "8868888988", "9868888986", "1968888961", "6968888969", "8968888968", "9968888966", "1088888801", "6088888809", "8088888808", "9088888806", "1188888811", "6188888819", "8188888818", "9188888816", "1688888891", "6688888899", "8688888898", "9688888896", "1888888881", "6888888889", "8888888888", "9888888886", "1988888861", "6988888869", "8988888868", "9988888866", "1098888601", "6098888609", "8098888608", "9098888606", "1198888611", "6198888619", "8198888618", "9198888616", "1698888691", "6698888699", "8698888698", "9698888696", "1898888681", "6898888689", "8898888688", "9898888686", "1998888661", "6998888669", "8998888668", "9998888666", "1009886001", "6009886009", "8009886008", "9009886006", "1109886011", "6109886019", "8109886018", "9109886016", "1609886091", "6609886099", "8609886098", "9609886096", "1809886081", "6809886089", "8809886088", "9809886086", "1909886061", "6909886069", "8909886068", "9909886066", "1019886101", "6019886109", "8019886108", "9019886106", "1119886111", "6119886119", "8119886118", "9119886116", "1619886191", "6619886199", "8619886198", "9619886196", "1819886181", "6819886189", "8819886188", "9819886186", "1919886161", "6919886169", "8919886168", "9919886166", "1069886901", "6069886909", "8069886908", "9069886906", "1169886911", "6169886919", "8169886918", "9169886916", "1669886991", "6669886999", "8669886998", "9669886996", "1869886981", "6869886989", "8869886988", "9869886986", "1969886961", "6969886969", "8969886968", "9969886966", "1089886801", "6089886809", "8089886808", "9089886806", "1189886811", "6189886819", "8189886818", "9189886816", "1689886891", "6689886899", "8689886898", "9689886896", "1889886881", "6889886889", "8889886888", "9889886886", "1989886861", "6989886869", "8989886868", "9989886866", "1099886601", "6099886609", "8099886608", "9099886606", "1199886611", "6199886619", "8199886618", "9199886616", "1699886691", "6699886699", "8699886698", "9699886696", "1899886681", "6899886689", "8899886688", "9899886686", "1999886661", "6999886669", "8999886668", "9999886666", "1000960001", "6000960009", "8000960008", "9000960006", "1100960011", "6100960019", "8100960018", "9100960016", "1600960091", "6600960099", "8600960098", "9600960096", "1800960081", "6800960089", "8800960088", "9800960086", "1900960061", "6900960069", "8900960068", "9900960066", "1010960101", "6010960109", "8010960108", "9010960106", "1110960111", "6110960119", "8110960118", "9110960116", "1610960191", "6610960199", "8610960198", "9610960196", "1810960181", "6810960189", "8810960188", "9810960186", "1910960161", "6910960169", "8910960168", "9910960166", "1060960901", "6060960909", "8060960908", "9060960906", "1160960911", "6160960919", "8160960918", "9160960916", "1660960991", "6660960999", "8660960998", "9660960996", "1860960981", "6860960989", "8860960988", "9860960986", "1960960961", "6960960969", "8960960968", "9960960966", "1080960801", "6080960809", "8080960808", "9080960806", "1180960811", "6180960819", "8180960818", "9180960816", "1680960891", "6680960899", "8680960898", "9680960896", "1880960881", "6880960889", "8880960888", "9880960886", "1980960861", "6980960869", "8980960868", "9980960866", "1090960601", "6090960609", "8090960608", "9090960606", "1190960611", "6190960619", "8190960618", "9190960616", "1690960691", "6690960699", "8690960698", "9690960696", "1890960681", "6890960689", "8890960688", "9890960686", "1990960661", "6990960669", "8990960668", "9990960666", "1001961001", "6001961009", "8001961008", "9001961006", "1101961011", "6101961019", "8101961018", "9101961016", "1601961091", "6601961099", "8601961098", "9601961096", "1801961081", "6801961089", "8801961088", "9801961086", "1901961061", "6901961069", "8901961068", "9901961066", "1011961101", "6011961109", "8011961108", "9011961106", "1111961111", "6111961119", "8111961118", "9111961116", "1611961191", "6611961199", "8611961198", "9611961196", "1811961181", "6811961189", "8811961188", "9811961186", "1911961161", "6911961169", "8911961168", "9911961166", "1061961901", "6061961909", "8061961908", "9061961906", "1161961911", "6161961919", "8161961918", "9161961916", "1661961991", "6661961999", "8661961998", "9661961996", "1861961981", "6861961989", "8861961988", "9861961986", "1961961961", "6961961969", "8961961968", "9961961966", "1081961801", "6081961809", "8081961808", "9081961806", "1181961811", "6181961819", "8181961818", "9181961816", "1681961891", "6681961899", "8681961898", "9681961896", "1881961881", "6881961889", "8881961888", "9881961886", "1981961861", "6981961869", "8981961868", "9981961866", "1091961601", "6091961609", "8091961608", "9091961606", "1191961611", "6191961619", "8191961618", "9191961616", "1691961691", "6691961699", "8691961698", "9691961696", "1891961681", "6891961689", "8891961688", "9891961686", "1991961661", "6991961669", "8991961668", "9991961666", "1006969001", "6006969009", "8006969008", "9006969006", "1106969011", "6106969019", "8106969018", "9106969016", "1606969091", "6606969099", "8606969098", "9606969096", "1806969081", "6806969089", "8806969088", "9806969086", "1906969061", "6906969069", "8906969068", "9906969066", "1016969101", "6016969109", "8016969108", "9016969106", "1116969111", "6116969119", "8116969118", "9116969116", "1616969191", "6616969199", "8616969198", "9616969196", "1816969181", "6816969189", "8816969188", "9816969186", "1916969161", "6916969169", "8916969168", "9916969166", "1066969901", "6066969909", "8066969908", "9066969906", "1166969911", "6166969919", "8166969918", "9166969916", "1666969991", "6666969999", "8666969998", "9666969996", "1866969981", "6866969989", "8866969988", "9866969986", "1966969961", "6966969969", "8966969968", "9966969966", "1086969801", "6086969809", "8086969808", "9086969806", "1186969811", "6186969819", "8186969818", "9186969816", "1686969891", "6686969899", "8686969898", "9686969896", "1886969881", "6886969889", "8886969888", "9886969886", "1986969861", "6986969869", "8986969868", "9986969866", "1096969601", "6096969609", "8096969608", "9096969606", "1196969611", "6196969619", "8196969618", "9196969616", "1696969691", "6696969699", "8696969698", "9696969696", "1896969681", "6896969689", "8896969688", "9896969686", "1996969661", "6996969669", "8996969668", "9996969666", "1008968001", "6008968009", "8008968008", "9008968006", "1108968011", "6108968019", "8108968018", "9108968016", "1608968091", "6608968099", "8608968098", "9608968096", "1808968081", "6808968089", "8808968088", "9808968086", "1908968061", "6908968069", "8908968068", "9908968066", "1018968101", "6018968109", "8018968108", "9018968106", "1118968111", "6118968119", "8118968118", "9118968116", "1618968191", "6618968199", "8618968198", "9618968196", "1818968181", "6818968189", "8818968188", "9818968186", "1918968161", "6918968169", "8918968168", "9918968166", "1068968901", "6068968909", "8068968908", "9068968906", "1168968911", "6168968919", "8168968918", "9168968916", "1668968991", "6668968999", "8668968998", "9668968996", "1868968981", "6868968989", "8868968988", "9868968986", "1968968961", "6968968969", "8968968968", "9968968966", "1088968801", "6088968809", "8088968808", "9088968806", "1188968811", "6188968819", "8188968818", "9188968816", "1688968891", "6688968899", "8688968898", "9688968896", "1888968881", "6888968889", "8888968888", "9888968886", "1988968861", "6988968869", "8988968868", "9988968866", "1098968601", "6098968609", "8098968608", "9098968606", "1198968611", "6198968619", "8198968618", "9198968616", "1698968691", "6698968699", "8698968698", "9698968696", "1898968681", "6898968689", "8898968688", "9898968686", "1998968661", "6998968669", "8998968668", "9998968666", "1009966001", "6009966009", "8009966008", "9009966006", "1109966011", "6109966019", "8109966018", "9109966016", "1609966091", "6609966099", "8609966098", "9609966096", "1809966081", "6809966089", "8809966088", "9809966086", "1909966061", "6909966069", "8909966068", "9909966066", "1019966101", "6019966109", "8019966108", "9019966106", "1119966111", "6119966119", "8119966118", "9119966116", "1619966191", "6619966199", "8619966198", "9619966196", "1819966181", "6819966189", "8819966188", "9819966186", "1919966161", "6919966169", "8919966168", "9919966166", "1069966901", "6069966909", "8069966908", "9069966906", "1169966911", "6169966919", "8169966918", "9169966916", "1669966991", "6669966999", "8669966998", "9669966996", "1869966981", "6869966989", "8869966988", "9869966986", "1969966961", "6969966969", "8969966968", "9969966966", "1089966801", "6089966809", "8089966808", "9089966806", "1189966811", "6189966819", "8189966818", "9189966816", "1689966891", "6689966899", "8689966898", "9689966896", "1889966881", "6889966889", "8889966888", "9889966886", "1989966861", "6989966869", "8989966868", "9989966866", "1099966601", "6099966609", "8099966608", "9099966606", "1199966611", "6199966619", "8199966618", "9199966616", "1699966691", "6699966699", "8699966698", "9699966696", "1899966681", "6899966689", "8899966688", "9899966686", "1999966661", "6999966669", "8999966668", "9999966666"), result));
    }
}