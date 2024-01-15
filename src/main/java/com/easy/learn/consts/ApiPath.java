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
    String WEBSITE_VENUE_GET_ALL = API + "/website-venue/get-all";
    String WEBSITE_VENUE_GET_ONE = API + "/website-venue/get-one";
    String WEBSITE_VENUE_CREATE = API + "/website-venue/create";
    String WEBSITE_VENUE_UPDATE = API + "/website-venue/update";
    String WEBSITE_VENUE_DELETE = API + "/website-venue/delete";
    //

    //WebsiteFinances
    String WEBSITE_FINANCES_GET_ALL = API + "/website-finances/get-all";
    String WEBSITE_FINANCES_GET_ONE = API + "/website-finances/get-one";
    String WEBSITE_FINANCES_CREATE = API + "/website-finances/create";
    String WEBSITE_FINANCES_UPDATE = API + "/website-finances/update";
    String WEBSITE_FINANCES_DELETE = API + "/website-finances/delete";
    //

    //WebsiteFinancesSummary
    String WEBSITE_FINANCES_SUMMARY_GET_ALL = API + "/website-finances-summary/get-all";
    String WEBSITE_FINANCES_SUMMARY_GET_ONE = API + "/website-finances-summary/get-one";
    String WEBSITE_FINANCES_SUMMARY_CREATE = API + "/website-finances-summary/create";
    String WEBSITE_FINANCES_SUMMARY_UPDATE = API + "/website-finances-summary/update";
    String WEBSITE_FINANCES_SUMMARY_DELETE = API + "/website-finances-summary/delete";
    //

    //FinalSalarySummary
    String FINAL_SALARY_SUMMARY_GET_ALL = API + "/final-salary-summary/get-all";
    String FINAL_SALARY_SUMMARY_GET_ONE = API + "/final-salary-summary/get-one";
    String FINAL_SALARY_SUMMARY_CREATE = API + "/final-salary-summary/create";
    String FINAL_SALARY_SUMMARY_UPDATE = API + "/final-salary-summary/update";
    String FINAL_SALARY_SUMMARY_DELETE = API + "/final-salary-summary/delete";
    //

    //StudentFinances
    String STUDENT_FINANCES_GET_ALL = API + "/student-finances/get-all";
    String STUDENT_FINANCES_GET_ONE = API + "/student-finances/get-one";
    String STUDENT_FINANCES_CREATE = API + "/student-finances/create";
    String STUDENT_FINANCES_UPDATE = API + "/student-finances/update";
    String STUDENT_FINANCES_DELETE = API + "/student-finances/delete";
    //

    //TrainerSalaryPaid
    String TRAINER_SALARY_PAID_GET_ALL = API + "/trainer-salary-paid/get-all";
    String TRAINER_SALARY_PAID_GET_ONE = API + "/trainer-salary-paid/get-one";
    String TRAINER_SALARY_PAID_CREATE = API + "/trainer-salary-paid/create";
    String TRAINER_SALARY_PAID_UPDATE = API + "/trainer-salary-paid/update";
    String TRAINER_SALARY_PAID_DELETE = API + "/trainer-salary-paid/delete";

    String TRAINER_SALARY_PAID_CHART = API + "/trainer-salary-paid/chart";
    //
    //trainersalarypaidSUMMARY
    String TRAINER_SALARY_SUMMARY_GET_ALL = API + "/trainer-salary-summary/get-all";
    String TRAINER_SALARY_SUMMARY_GET_ONE = API + "/trainer-salary-summary/get-one";
    String TRAINER_SALARY_SUMMARY_CREATE = API + "/trainer-salary-summary/create";
    String TRAINER_SALARY_SUMMARY_UPDATE = API + "/trainer-salary-summary/update";
    String TRAINER_SALARY_SUMMARY_DELETE = API + "/trainer-salary-summary/delete";
    //

    String MANAGER_SIGN_IN = API + "/manager/sign-in";
    String MANAGER_GET_ALL = API + "/manager/get-all";

    // end
    // trainer
    String TRAINER_GET_ALL = API + "/trainer/get-all";
    String TRAINER_GET_ID = API + "/trainer/get-id";
    String TRAINER_CREATE = API + "/trainer/create";
    String TRAINER_UPDATE = API + "/trainer/update";
    String TRAINER_DELETE = API + "/trainer/delete";
    String TRAINER_GET_ALL_NOT_HAVE_SALARY = API + "/trainer/get-all-not-salary";

    String ADMIN_GET_INDEX = API+"/admin";
}
