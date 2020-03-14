package com.finalproject.automated.refactoring.tool.extract.method.refactoring.service;

import com.finalproject.automated.refactoring.tool.duplicate.code.detection.model.CloneCandidate;
import com.finalproject.automated.refactoring.tool.extract.method.refactoring.model.Candidate;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface CandidateAnalysis {

    List<Candidate> analysis(@NonNull MethodModel methodModel);

    Candidate analysisForDuplicate(@NonNull CloneCandidate cloneCandidate);
}
