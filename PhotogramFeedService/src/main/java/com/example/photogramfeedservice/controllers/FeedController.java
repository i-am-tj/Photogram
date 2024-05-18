package com.example.photogramfeedservice.controllers;

/*
    Feed Management:
    GET /api/feed/{userId}: Get the feed for a specific user.
    POST /api/feed/{userId}/follow: Follow another user.
    DELETE /api/feed/{userId}/unfollow: Unfollow a user.

    Feed Interaction:
    POST /api/feed/posts/{postId}/like: Like a post in the feed.
    POST /api/feed/posts/{postId}/comment: Comment on a post in the feed.
    DELETE /api/feed/posts/{postId}/like: Unlike a post in the feed.
    DELETE /api/feed/posts/{postId}/comment/{commentId}: Delete a comment on a post in the feed.

    Feed Discovery:
    GET /api/feed/discover: Get recommended posts or users to follow.
    GET /api/feed/explore: Explore trending or popular posts.

    Feed Filtering:
    GET /api/feed/filter?category={category}: Filter feed by category.
 */
public class FeedController {
}
