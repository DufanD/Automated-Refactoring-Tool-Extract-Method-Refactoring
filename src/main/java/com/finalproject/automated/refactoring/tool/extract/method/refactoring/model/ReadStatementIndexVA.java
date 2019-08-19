package com.finalproject.automated.refactoring.tool.extract.method.refactoring.model;

import lombok.Builder;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class ReadStatementIndexVA {

    private Integer variableStatementIndex;

    @Builder.Default
    private AtomicInteger statementCount = new AtomicInteger();

    private Integer realStatementIndex;
}
