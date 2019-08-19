package com.finalproject.automated.refactoring.tool.extract.method.refactoring.model;

import com.finalproject.automated.refactoring.tool.model.PropertyModel;
import com.finalproject.automated.refactoring.tool.model.StatementModel;
import com.finalproject.automated.refactoring.tool.model.VariablePropertyModel;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class Candidate {

    @Builder.Default
    private List<StatementModel> statements = new ArrayList<>();

    @Builder.Default
    private List<VariablePropertyModel> localVariables = new ArrayList<>();

    @Builder.Default
    private List<String> globalVariables = new ArrayList<>();

    @Builder.Default
    private List<PropertyModel> parameters = new ArrayList<>();

    @Builder.Default
    private List<List<String>> rawVariables = new ArrayList<>();

    private PropertyModel returnType;

    private String returnTypeStatement;

    private Integer returnTypeStatementRawVariableIndex;

    private Double lengthScore;

    private Double nestingDepthScore;

    private Double nestingAreaScore;

    private Double parameterScore;

    private Double totalScore;
}
