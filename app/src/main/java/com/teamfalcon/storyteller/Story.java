package com.teamfalcon.storyteller;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Story {
    @SerializedName("_id")
    @Expose
    String _id;

    @SerializedName("slug")
    @Expose
    String slug;

    @SerializedName("title")
    @Expose
    String title;

    @SerializedName("description")
    @Expose
    String description;

    @SerializedName("authorname")
    @Expose
    String authorName;

    //author: [User]
    //            createdAt: String
    //            updatedAt: String
    //            tags: [String]

    @SerializedName("author")
    @Expose
    User author;

    @SerializedName("tags")
    @Expose
    String[] tags;

    public String get_id() {
        return _id;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAuthor() {
        return author;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthorName() {
        return authorName;
    }
}
