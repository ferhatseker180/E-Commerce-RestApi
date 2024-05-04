package org.ferhat.restapiproject.core.utils;

import org.ferhat.restapiproject.core.result.Result;
import org.ferhat.restapiproject.core.result.ResultData;

public class ResultHelper {

    public static <T>ResultData<T> created(T data){
        return new ResultData<>(true,Message.CREATED,"201",data);
    }

    public static <T> ResultData<T> validateError(T data){
        return new ResultData<>(false,Message.VALIDATE_ERROR,"400",data);
    }

    public static <T> ResultData<T> success(T data){
        return new ResultData<>(true,Message.OK,"200",data);
    }

    public static Result resultNotFoundError(String message){
        return new Result(false,message,"404");
    }
}
