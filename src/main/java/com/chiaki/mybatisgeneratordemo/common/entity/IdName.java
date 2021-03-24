package com.chiaki.mybatisgeneratordemo.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chenliang258
 * @date 2021/3/24 14:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdName implements Serializable {

    private static final long serialVersionUID = -2697439147715697100L;

    private Integer id;

    private String name;
}
