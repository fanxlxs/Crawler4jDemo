package utill.musicutil;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-06-079:51
 */
public class XiamiUtil {

    public static void main(String[] args) {
       String str = HttpUtil.requestUrl("https://www.xiami.com/search?key=%E8%AE%B2%E7%9C%9F%E7%9A%84&pos=1");

        System.out.println(str);
    }

}
