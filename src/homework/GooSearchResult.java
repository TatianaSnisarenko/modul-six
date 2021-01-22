package homework;

class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String[] parts1 = url.split("://");
        String [] parts2 = parts1[1].split("/");
        return parts2[0];
    }

    /*public String parseDomain() {
        int startOfDomain = url.indexOf(":") + 3;
        int endOfDomain = url.indexOf("/", startOfDomain + 1);
        if (endOfDomain == -1) {
            endOfDomain = url.length();
        }
        return url.substring(startOfDomain, endOfDomain);
    }*/
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}