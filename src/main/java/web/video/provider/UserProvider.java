package web.video.provider;

/**
 * User类构建动态sql语句 也可以使用mybatis xml的格式去操作
 */
public class UserProvider {
    /**
     * 更新video动态语句 下面这个是示例 用不了的 提供参考
     * @param video
     * @return
     *//* public String updateVideo(final Video video) {
        return new SQL() {{
            UPDATE("video");
            //条件写法
            if (video.getTitle() != null) {
                SET("title=#{title}");
            }
            if (video.getSummary() != null) {
                SET("summary=#{summary}");
            }
            if (video.getCoverImg() != null) {
                SET("cover_img=#{coverImg}");
            }
            if (video.getViewNum() != null) {
                SET("view_num=#{viewNum}");
            }
            if (video.getPrice() != null) {
                SET("price=#{price}");
            }
            if (video.getOnline() != null) {
                SET("online=#{online}");
            }
            if (video.getPoint() != null) {
                SET("point=#{point}");
            }
            WHERE("id=#{id}");

        }}.toString();
    }*/


}
