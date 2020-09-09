package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammerITService {

    public String[][] programmerIT(String[] dictionary, String input) {
        List<List<String>> temp = new ArrayList<>();
        for (String word: dictionary) {
            if (input.startsWith(word)) {
                List<String> row = new ArrayList<>();
                temp.add(row);
                row.add(word);
                if (input.length() > word.length()) {
                    match(dictionary, input.substring(word.length()), row);
                }
            }
        }
        return toArray(temp);
    }

    private void match(String[] dictionary, String input, List<String> row) {
        boolean found = false;
        for (String word: dictionary) {
            if (input.startsWith(word)) {
                found = true;
                row.add(word);
                if (input.length() > word.length()) {
                    match(dictionary, input.substring(word.length()), row);
                }
            }
        }
        if (!found) {
            row.clear();
        }
    }

    private String[][] toArray(List<List<String>> input) {
        String[][] result = new String[input.size()][];
        for (int i = 0; i < input.size(); i++) {
            List<String> row = input.get(i);
            if (row.size() > 0) {
                result[i] = row.toArray(new String[row.size()]);
            } else {
                return null;
            }
        }
        return result;
    }

}
