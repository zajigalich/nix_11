package ua.com.alevel;

import org.apache.commons.lang3.StringUtils;
import ua.com.alevel.punk.WithoutFantasyAnt;

public class MainAnt {
    public static void main(String[] args) {
        System.out.println(StringUtils.upperCase("Hello world"));
        WithoutFantasyAnt.WithoutFantasy();
        NoProblemsAnt.NoProblems();
    }
}
