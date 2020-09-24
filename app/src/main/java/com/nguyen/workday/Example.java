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

class DownsizedLarge {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class DownsizedMedium {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class DownsizedSmall {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
}

class DownsizedStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class FixedHeight {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedHeightDownsampled {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedHeightSmall {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedHeightSmallStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class FixedHeightStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class FixedWidth {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedWidthDownsampled {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedWidthSmall {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
    @SerializedName("webp_size")
    public String webpSize;
    @SerializedName("webp")
    public String webp;
}

class FixedWidthSmallStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class FixedWidthStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class Hd {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
}

class Images {
    @SerializedName("original")
    public Original original;
    @SerializedName("downsized")
    public Downsized downsized;
    @SerializedName("downsized_large")
    public DownsizedLarge downsizedLarge;
    @SerializedName("downsized_medium")
    public DownsizedMedium downsizedMedium;
    @SerializedName("downsized_small")
    public DownsizedSmall downsizedSmall;
    @SerializedName("downsized_still")
    public DownsizedStill downsizedStill;
    @SerializedName("fixed_height")
    public FixedHeight fixedHeight;
    @SerializedName("fixed_height_downsampled")
    public FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("fixed_height_small")
    public FixedHeightSmall fixedHeightSmall;
    @SerializedName("fixed_height_small_still")
    public FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_still")
    public FixedHeightStill fixedHeightStill;
    @SerializedName("fixed_width")
    public FixedWidth fixedWidth;
    @SerializedName("fixed_width_downsampled")
    public FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("fixed_width_small")
    public FixedWidthSmall fixedWidthSmall;
    @SerializedName("fixed_width_small_still")
    public FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("fixed_width_still")
    public FixedWidthStill fixedWidthStill;
    @SerializedName("looping")
    public Looping looping;
    @SerializedName("original_still")
    public OriginalStill originalStill;
    @SerializedName("preview")
    public Preview preview;
    @SerializedName("preview_gif")
    public PreviewGif previewGif;
    @SerializedName("hd")
    public Hd hd;
}

class Looping {
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
}

class Meta {
    @SerializedName("status")
    public Integer status;
    @SerializedName("msg")
    public String msg;
    @SerializedName("response_id")
    public String responseId;
}

class Onclick {
    @SerializedName("url")
    public String url;
}

class Onload {
    @SerializedName("url")
    public String url;
}

class Onsent {
    @SerializedName("url")
    public String url;
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

class OriginalMp4 {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
}

class OriginalStill {
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

class Preview {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("mp4_size")
    public String mp4Size;
    @SerializedName("mp4")
    public String mp4;
}

class PreviewGif {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}

class PreviewWebp {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
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

class _480wStill {
    @SerializedName("height")
    public String height;
    @SerializedName("width")
    public String width;
    @SerializedName("size")
    public String size;
    @SerializedName("url")
    public String url;
}
