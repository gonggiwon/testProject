package com.iteratrlearning.shu_book.chapter_02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
/*
 * 기본 클래스 main.java.com.iteratrlearning.shu_book.chapter_02.BankStatementAnalyzerSimple을(를) 찾거나 로드할 수 없습니다.///
   해결:프로젝트 우클릭 -> properties -> Run/Debug Setting 중앙에 들어있는 java application에 설정되어있는것을 삭제
 
 * 2-1 입출금관리기 => 모든 기능이 모여 있다. KISS 원칙 위배(Keep it short and simple) 
 */

public class BankStatementAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(final String[] args) throws Exception {
            final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
            final List<String> lines = Files.readAllLines(path);
            double total = 0;
            for(final String line: lines) {
                String[] columns = line.split(",");
                double amount = Double.parseDouble(columns[1]);
                total += amount;
            }

            System.out.println("The total for all transactions is " + total);
    }
}

