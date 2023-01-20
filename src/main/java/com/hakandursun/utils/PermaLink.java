package com.hakandursun.utils;

public class PermaLink {
    public static String getPermaLink(String title) {
        String permaLink = title.toLowerCase();
        permaLink = permaLink.replaceAll(" ", "-");
        permaLink = permaLink.replaceAll("ı", "i");
        permaLink = permaLink.replaceAll("ğ", "g");
        permaLink = permaLink.replaceAll("ü", "u");
        permaLink = permaLink.replaceAll("ş", "s");
        permaLink = permaLink.replaceAll("ö", "o");
        permaLink = permaLink.replaceAll("ç", "c");
        permaLink = permaLink.replaceAll("İ", "i");
        permaLink = permaLink.replaceAll("Ğ", "g");
        permaLink = permaLink.replaceAll("Ü", "u");
        permaLink = permaLink.replaceAll("Ş", "s");
        permaLink = permaLink.replaceAll("Ö", "o");
        permaLink = permaLink.replaceAll("Ç", "c");
        permaLink = permaLink.replaceAll("[^a-zA-Z0-9-]", "");
        return permaLink;
    }
}
}
