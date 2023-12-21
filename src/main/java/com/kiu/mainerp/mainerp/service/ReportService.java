package com.kiu.mainerp.mainerp.service;

import com.kiu.mainerp.mainerp.response.ResponseList;

import java.text.ParseException;
import java.util.Date;

public interface ReportService {
    ResponseList getAllData(int offSet, int pageSize) throws ParseException;
    ResponseList getAll() throws ParseException;
    ResponseList getIncomeData() throws ParseException;
    ResponseList getAllIncomeDataPaginated(int offSet,int pageSize) throws  ParseException;
    ResponseList getDueReports(Integer dateRange) throws ParseException;
    ResponseList getStudentsWithoutPaymentCards()throws ParseException;
    ResponseList getOutStandingReport(String startDate,String endDate)throws  ParseException;
    ResponseList getOtherPaymentOutStandingReport(String startDate, String endDate)throws  ParseException;
}