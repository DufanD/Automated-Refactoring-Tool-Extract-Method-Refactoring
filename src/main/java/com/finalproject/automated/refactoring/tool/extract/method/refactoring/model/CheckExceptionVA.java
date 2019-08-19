package com.finalproject.automated.refactoring.tool.extract.method.refactoring.model;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class CheckExceptionVA {

    private Integer catchStatementArrayIndex;

    private MethodModel methodModel;

    private StatementModel statementModel;

    private List<StatementModel> methodStatements;

    private List<String> exceptions;
}
