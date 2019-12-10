package com.zhunongyun.toalibaba.designpatterns.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                return new Member(rs.getString("username"),
                        rs.getString("password"), rs.getString("nickName"),
                        rs.getInt("age"), rs.getString("addr"));
            }
        }, null);
    }
}