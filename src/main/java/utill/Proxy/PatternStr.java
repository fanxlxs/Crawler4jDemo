package utill.Proxy;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:获取代理ip所需正则表达式
 * @date 2018-06-0817:26
 */
public interface PatternStr {
    public static final String IP66RULE="<td>(\\d{1,3}.\\d{0,3}.\\d{0,3}.\\d{0,3})</td><td>(\\d{1,5})</td>";
    public static final String WANGNENGRULE="<td>(\\d{1,3}.\\d{0,3}.\\d{0,3}.\\d{0,3})</td>\\s{0,}<td>(\\d{1,5})</td>";
}
