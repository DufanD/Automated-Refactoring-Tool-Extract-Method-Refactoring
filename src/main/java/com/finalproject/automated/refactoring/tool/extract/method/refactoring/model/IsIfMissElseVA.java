package com.finalproject.automated.refactoring.tool.extract.method.refactoring.model;

import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class IsIfMissElseVA {

    private List<StatementModel> statements;

    private StatementModel statementModel;

    private StatementModel beforeStatementModel;

    private StatementModel nextIfStatementModel;

    private AtomicBoolean isIfMissElseBlock;
}
