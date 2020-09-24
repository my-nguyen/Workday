package com.nguyen.workday;

import java.io.Serializable;

class Giphy implements Serializable {
    String id;
    String url;
    String username;
    String rating;
    String source;

    String embedUrl;
    String imageOriginalUrl;
    String imageDownsizedUrl;

    public Giphy(Data data) {
        id = data.id;
        url = data.url;
        username = data.username;
        rating = data.rating;
        source = data.source;

        this.embedUrl = data.embedUrl;
        this.imageOriginalUrl = data.images.original.url;
        this.imageDownsizedUrl = data.images.downsized.url;
    }
}
