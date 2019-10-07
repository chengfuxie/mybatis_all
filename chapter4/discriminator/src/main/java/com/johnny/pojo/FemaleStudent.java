package com.johnny.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class FemaleStudent extends Student {
    private List<StudentHealthFemale> studentHealthFemaleList;
}