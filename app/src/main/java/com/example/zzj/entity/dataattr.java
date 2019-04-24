package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class dataattr {

    @Id
    private Long data_id;

    private String name;

    private int  class1;

    private int unit_id;

    private int type;

    private int offset;

    private int length;

    private String unit;

    private int kind;

    private float max;

    private float min;

    private int scale;

    public int getScale() {
        return this.scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public float getMin() {
        return this.min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return this.max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public int getKind() {
        return this.kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUnit_id() {
        return this.unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getClass1() {
        return this.class1;
    }

    public void setClass1(int class1) {
        this.class1 = class1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getData_id() {
        return this.data_id;
    }

    public void setData_id(Long data_id) {
        this.data_id = data_id;
    }

    @Generated(hash = 1332980735)
    public dataattr(Long data_id, String name, int class1, int unit_id, int type,
            int offset, int length, String unit, int kind, float max, float min,
            int scale) {
        this.data_id = data_id;
        this.name = name;
        this.class1 = class1;
        this.unit_id = unit_id;
        this.type = type;
        this.offset = offset;
        this.length = length;
        this.unit = unit;
        this.kind = kind;
        this.max = max;
        this.min = min;
        this.scale = scale;
    }

    @Generated(hash = 26474151)
    public dataattr() {
    }

}
