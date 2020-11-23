package test.gjz.jdbc;

import lombok.Data;

/**
 * <pre>
 * 用户
 * </pre>
 *
 * @author jiazhen.guo@meicloud.com
 * @version 1.00.00
 * @createDate 2020/11/18 15:06
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@Data
public class User {
    private Long id;
    private String name;
    private String userId;
    private Integer age;
    private String address;
}
