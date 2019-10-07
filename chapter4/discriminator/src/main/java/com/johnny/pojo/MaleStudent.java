package com.johnny.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class MaleStudent extends Student {
    private List<StudentHealthMale> studentHealthMaleList;
}
