package com.lizhizhao.db.SpringBootMyBatis.bean;

import java.math.BigDecimal;
import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sno;

    private String sname;

    private String ssex;

    private BigDecimal score;

    /**
     * @return sno
     */
    public Integer getSno() {
        return sno;
    }

    /**
     * @param sno
     */
    public void setSno(Integer sno) {
        this.sno = sno;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return ssex
     */
    public String getSsex() {
        return ssex;
    }

    /**
     * @param ssex
     */
    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    /**
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }
}