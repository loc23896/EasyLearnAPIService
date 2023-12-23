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

    //WebsiteVenue
    String WEBSITE_VENUE_GET_ALL = API + "/websitevenue/get-all";
    String WEBSITE_VENUE_GET_ONE = API + "/websitevenue/get-one";
    String WEBSITE_VENUE_CREATE = API + "/websitevenue/create";
    String WEBSITE_VENUE_UPDATE = API + "/websitevenue/update";
    String WEBSITE_VENUE_DELETE = API + "/websitevenue/delete";
    //

    //WebsiteFinances
    String WEBSITE_FINANCES_GET_ALL = API + "/websitefinances/get-all";
    String WEBSITE_FINANCES_GET_ONE = API + "/websitefinances/get-one";
    String WEBSITE_FINANCES_CREATE = API + "/websitefinances/create";
    String WEBSITE_FINANCES_UPDATE = API + "/websitefinances/update";
    String WEBSITE_FINANCES_DELETE = API + "/websitefinances/delete";
    //

    //WebsiteFinancesSummary
    String WEBSITE_FINANCES_SUMMARY_GET_ALL = API + "/websitefinancessummary/get-all";
    String WEBSITE_FINANCES_SUMMARY_GET_ONE = API + "/websitefinancessummary/get-one";
    String WEBSITE_FINANCES_SUMMARY_CREATE = API + "/websitefinancessummary/create";
    String WEBSITE_FINANCES_SUMMARY_UPDATE = API + "/websitefinancessummary/update";
    String WEBSITE_FINANCES_SUMMARY_DELETE = API + "/websitefinancessummary/delete";
    //

    //FinalSalarySummary
    String FINAL_SALARY_SUMMARY_GET_ALL = API + "/finalsalarysummary/get-all";
    String FINAL_SALARY_SUMMARY_GET_ONE = API + "/finalsalarysummary/get-one";
    String FINAL_SALARY_SUMMARY_CREATE = API + "/finalsalarysummary/create";
    String FINAL_SALARY_SUMMARY_UPDATE = API + "/finalsalarysummary/update";
    String FINAL_SALARY_SUMMARY_DELETE = API + "/finalsalarysummary/delete";
    //

    //StudentFinances
    String STUDENT_FINANCES_GET_ALL = API + "/studentfinances/get-all";
    String STUDENT_FINANCES_GET_ONE = API + "/studentfinances/get-one";
    String STUDENT_FINANCES_CREATE = API + "/studentfinances/create";
    String STUDENT_FINANCES_UPDATE = API + "/studentfinances/update";
    String STUDENT_FINANCES_DELETE = API + "/studentfinances/delete";
    //

    //TrainerSalaryPaid
    String TRAINER_SALARY_PAID_GET_ALL = API + "/trainersalary/get-all";
    String TRAINER_SALARY_PAID_GET_ONE = API + "/trainersalarypaid/get-one";
    String TRAINER_SALARY_PAID_CREATE = API + "/trainersalarypaid/create";
    String TRAINER_SALARY_PAID_UPDATE = API + "/trainersalarypaid/update";
    String TRAINER_SALARY_PAID_DELETE = API + "/trainersalarypaid/delete";
    //
    //trainersalarypaidSUMMARY
    String TRAINER_SALARY_SUMMARY_GET_ALL = API + "/trainersalarysummary/get-all";
    String TRAINER_SALARY_SUMMARY_GET_ONE = API + "/trainersalarysummary/get-one";
    String TRAINER_SALARY_SUMMARY_CREATE = API + "/trainersalarysummary/create";
    String TRAINER_SALARY_SUMMARY_UPDATE = API + "/trainersalarysummary/update";
    String TRAINER_SALARY_SUMMARY_DELETE = API + "/trainersalarysummary/delete";
    //

    String MANAGER_SIGN_IN = API + "/manager/sign-in";
    String MANAGER_GET_ALL = API + "/manager/get-all";

    //    trainer
    String TRAINER_GET_ALL = API + "/trainer/get-all";
    String TRAINER_GET_UUID = API + "/trainer/get-by-uuid";
    String TRAINER_CREATE = API + "/trainer/create";
    String TRAINER_UPDATE = API + "/trainer/get-update";
    String TRAINER_DELETE = API + "/trainer/delete";

    // end
    // student
    String STUDENT_GET_ALL = API + "/student/get-all";
    String STUDENT_GET_UUID = API + "/student/get-by-uuid";
    String STUDENT_CREATE = API + "/student/create";
    String STUDENT_UPDATE = API + "/student/update";
    String STUDENT_DELETE = API + "/student/delete";
// feedback
String FEEDBACK_GET_ALL = API + "/feedback/get-all";
    String FEEDBACK_GET_UUID = API + "/feedback/get-by-uuid";
    String FEEDBACK_CREATE = API + "/feedback/create";
    String FEEDBACK_UPDATE = API + "/feedback/update";
    String FEEDBACK_DELETE = API + "/feedback/delete";
    String ADMIN_GET_INDEX = API+"/admin";
}
