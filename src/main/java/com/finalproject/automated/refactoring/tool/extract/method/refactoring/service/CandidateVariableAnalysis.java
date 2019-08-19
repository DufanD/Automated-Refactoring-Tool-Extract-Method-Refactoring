package com.finalproject.automated.refactoring.tool.extract.method.refactoring.service;

import com.finalproject.automated.refactoring.tool.extract.method.refactoring.model.Candidate;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface CandidateVariableAnalysis {

    void analysis(@NonNull MethodModel methodModel, @NonNull Candidate candidate);
}
