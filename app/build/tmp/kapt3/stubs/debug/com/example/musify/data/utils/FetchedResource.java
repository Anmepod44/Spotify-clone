package com.example.musify.data.utils;

import java.lang.System;

/**
 * A sealed class hierarchy that is used to encapsulate a fetched
 * resource of type [ResourceType]. If any error occurs, the
 * [FailureType] will be used.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/musify/data/utils/FetchedResource;", "ResourceType", "FailureType", "", "()V", "Failure", "Success", "Lcom/example/musify/data/utils/FetchedResource$Success;", "Lcom/example/musify/data/utils/FetchedResource$Failure;", "app_debug"})
public abstract class FetchedResource<ResourceType extends java.lang.Object, FailureType extends java.lang.Object> {
    
    private FetchedResource() {
        super();
    }
    
    /**
     * A class that encapsulates a successful fetch of a resource of
     * type [ResourceType]. The [data] property  holds the resource.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/example/musify/data/utils/FetchedResource$Success;", "ResourceType", "FailureType", "Lcom/example/musify/data/utils/FetchedResource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/example/musify/data/utils/FetchedResource$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<ResourceType extends java.lang.Object, FailureType extends java.lang.Object> extends com.example.musify.data.utils.FetchedResource<ResourceType, FailureType> {
        private final ResourceType data = null;
        
        /**
         * A class that encapsulates a successful fetch of a resource of
         * type [ResourceType]. The [data] property  holds the resource.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.utils.FetchedResource.Success<ResourceType, FailureType> copy(ResourceType data) {
            return null;
        }
        
        /**
         * A class that encapsulates a successful fetch of a resource of
         * type [ResourceType]. The [data] property  holds the resource.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A class that encapsulates a successful fetch of a resource of
         * type [ResourceType]. The [data] property  holds the resource.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A class that encapsulates a successful fetch of a resource of
         * type [ResourceType]. The [data] property  holds the resource.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(ResourceType data) {
            super();
        }
        
        public final ResourceType component1() {
            return null;
        }
        
        public final ResourceType getData() {
            return null;
        }
    }
    
    /**
     * A class that encapsulates an un-successful fetch operation
     * of a resource of type [ResourceType]. The [cause] property
     * contains the [FailureType]. The [data] property contains an
     * optional resource that can be used to specify the data to be
     * used in the case of failure.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00028\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/musify/data/utils/FetchedResource$Failure;", "ResourceType", "FailureType", "Lcom/example/musify/data/utils/FetchedResource;", "cause", "data", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getCause", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getData", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/musify/data/utils/FetchedResource$Failure;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Failure<ResourceType extends java.lang.Object, FailureType extends java.lang.Object> extends com.example.musify.data.utils.FetchedResource<ResourceType, FailureType> {
        private final FailureType cause = null;
        @org.jetbrains.annotations.Nullable()
        private final ResourceType data = null;
        
        /**
         * A class that encapsulates an un-successful fetch operation
         * of a resource of type [ResourceType]. The [cause] property
         * contains the [FailureType]. The [data] property contains an
         * optional resource that can be used to specify the data to be
         * used in the case of failure.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.data.utils.FetchedResource.Failure<ResourceType, FailureType> copy(FailureType cause, @org.jetbrains.annotations.Nullable()
        ResourceType data) {
            return null;
        }
        
        /**
         * A class that encapsulates an un-successful fetch operation
         * of a resource of type [ResourceType]. The [cause] property
         * contains the [FailureType]. The [data] property contains an
         * optional resource that can be used to specify the data to be
         * used in the case of failure.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A class that encapsulates an un-successful fetch operation
         * of a resource of type [ResourceType]. The [cause] property
         * contains the [FailureType]. The [data] property contains an
         * optional resource that can be used to specify the data to be
         * used in the case of failure.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A class that encapsulates an un-successful fetch operation
         * of a resource of type [ResourceType]. The [cause] property
         * contains the [FailureType]. The [data] property contains an
         * optional resource that can be used to specify the data to be
         * used in the case of failure.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Failure(FailureType cause, @org.jetbrains.annotations.Nullable()
        ResourceType data) {
            super();
        }
        
        public final FailureType component1() {
            return null;
        }
        
        public final FailureType getCause() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ResourceType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ResourceType getData() {
            return null;
        }
    }
}