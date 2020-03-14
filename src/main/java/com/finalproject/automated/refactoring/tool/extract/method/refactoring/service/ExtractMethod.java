package com.finalproject.automated.refactoring.tool.extract.method.refactoring.service;

import com.finalproject.automated.refactoring.tool.duplicate.code.detection.model.ClonePair;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface ExtractMethod {

    Boolean refactoring(@NonNull String path, @NonNull MethodModel methodModel);

    Boolean refactoringForDuplicate(@NonNull String path, @NonNull ClonePair clonePair);
}
