package com.nguyen.workday;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {
    @SerializedName("data")
    public List<Data> data = null;
    @SerializedName("pagination")
    public Pagination pagination;
    @SerializedName("meta")
    public Meta meta;
}

class Data {
    @SerializedName("type")
    public String type;
    @SerializedName("id")
    public String id;
    @SerializedName("url")
    public String url;
    @SerializedName("slug")
    public String slug;
    @SerializedName("bitly_gif_url")
    public String bitlyGifUrl;
    @SerializedName("bitly_url")
    public String bitlyUrl;
    @SerializedName("embed_url")
    public String embedUrl;
    @SerializedName("username")
    public String username;
    @SerializedName("source")
    public String source;
    @SerializedName("title")
    public String title;
    @SerializedName("rating")
    public String rating;
    @SerializedName("content_url")
    public String contentUrl;
    @SerializedName("tags")
    public List<Object> tags = null;
    @SerializedName("featured_tags")
    public List<Object> featuredTags = null;
    @SerializedName("user_tags")
    public List<Object> userTags = null;
    @SerializedName("source_tld")
    public String sourceTld;
    @SerializedName("source_post_url")
    public String sourcePostUrl;
    @SerializedName("is_sticker")
    public Integer isSticker;
    @SerializedName("import_datetime")
    public String importDatetime;
    @SerializedName("trending_datetime")
    public String trendingDatetime;
    @SerializedName("images")
    public Images images;
    @SerializedName("user")
    public User user;
    @SerializedName("analytics_response_payload")
    public String analyticsResponsePayload;
}

class Downsized {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class Images {
    @SerializedName("original")
    public Original original;
    @SerializedName("downsized")
    public Downsized downsized;
}

class Meta {
    @SerializedName("status")
    public Integer status;
    @SerializedName("msg")
    public String msg;
    @SerializedName("response_id")
    public String responseId;
}

class Original {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class Pagination {
    @SerializedName("total_count")
    public Integer totalCount;
    @SerializedName("count")
    public Integer count;
    @SerializedName("offset")
    public Integer offset;
}

class User {
    @SerializedName("avatar_url")
    public String avatarUrl;
    @SerializedName("banner_image")
    public String bannerImage;
    @SerializedName("banner_url")
    public String bannerUrl;
    @SerializedName("profile_url")
    public String profileUrl;
    @SerializedName("username")
    public String username;
    @SerializedName("display_name")
    public String displayName;
    @SerializedName("is_verified")
    public Boolean isVerified;
}

