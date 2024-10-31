package com.askie01.recipeapp.service;

import com.askie01.recipeapp.service.operation.CreateOperation;
import com.askie01.recipeapp.service.operation.DeleteOperation;
import com.askie01.recipeapp.service.operation.GetOperation;
import com.askie01.recipeapp.service.operation.UpdateOperation;

public interface CrudService<T> extends
        CreateOperation<T>,
        GetOperation<T>,
        UpdateOperation<T>,
        DeleteOperation<T> {

}
