package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.controller.operation.CreateOperation;
import com.askie01.recipeapp.controller.operation.DeleteOperation;
import com.askie01.recipeapp.controller.operation.GetOperation;
import com.askie01.recipeapp.controller.operation.UpdateOperation;

public interface CrudController<Response, T> extends
        CreateOperation<Response, T>,
        GetOperation<T>,
        UpdateOperation<Response, T>,
        DeleteOperation<Response, T> {

}
