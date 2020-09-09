package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

@Service
public class HotDogService {

    public List<String> transform(String[] dictionary, String origin, String target) {
        int count = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        List<String> vertex = new ArrayList<>();
        vertex.add(origin);
        vertex.addAll(stream(dictionary)
                .filter(item -> (!item.equals(origin) && !item.equals(target)))
                .collect(toList()));
        vertex.add(target);

        boolean[] visited = new boolean[vertex.size()];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Queue<String> queue = new PriorityQueue<>();

        visited[0] = true;
        queue.offer(vertex.get(0));

        List<String> path = new ArrayList<>();

        while (!queue.isEmpty()) {
            String node = queue.poll();
            path.add(node);

            if (node.equals(target) && count > path.size()) {
                result.addAll(path);
                count = path.size();
            }

            for (int i = 0; i < vertex.size(); i++) {
                if (diff(node, vertex.get(i)) == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(vertex.get(i));
                }
            }
        }

        return result.size() > 0 ? result : null;
    }

    private int diff(String origin, String target) {
        int count = 0;
        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        return count;
    }

}
