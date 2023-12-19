package com.easy.learn.consts;

public interface ApiPath {
    String API = "/api/v1";

    //ping
    String PING = API + "/ping";

    //user
    String USER_SIGN_IN = API + "/sign-in";
    String USER_GET_ALL = API + "/user/get-all";
    String USER_GET_UUID = API + "/user/get-by-uuid";
    String USER_CREATE = API + "/user/create";
    String USER_UPDATE = API + "/user/update";
    String USER_DELETE = API + "/user/delete";

    //trainersalarypaid
    String TRAINER_SALARY_GET_ALL = API + "/trainersalary/get-all";
    String TRAINER_SALARY_GET_ONE = API + "/trainersalary/get-one";
    String TRAINER_SALARY_CREATE = API + "/trainersalary/create";
    String TRAINER_SALARY_UPDATE = API + "/trainersalary/update";
    String TRAINER_SALARY_DELETE = API + "/trainersalary/delete";
    String MANAGER_SIGN_IN = API + "/manager/sign-in";
    String MANAGER_GET_ALL = API + "/manager/get-all";

    //    trainer
    String TRAINER_GET_ALL = API + "/trainer/get-all";
    String TRAINER_GET_UUID = API + "/trainer/get-by-uuid";
    String TRAINER_CREATE = API + "/trainer/create";
    String TRAINER_UPDATE = API + "/trainer/get-update";
    String TRAINER_DELETE = API + "/trainer/delete";

    // end

    String ADMIN_GET_INDEX = API+"/admin";
}
