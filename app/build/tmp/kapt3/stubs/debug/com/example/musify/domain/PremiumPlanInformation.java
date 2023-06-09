package com.example.musify.domain;

import java.lang.System;

/**
 * A class that models a premium plan that is available for purchase.
 * The [colorInformation] property will be used for generating
 * a gradient.
 *
 * @param id the id of the plan.
 * @param name the name of the plan.
 * @param highlights a list of highlights of the plan.
 * @param termsAndConditions the terms and conditions of the plan.
 * @param pricingInformation an instance of [PricingInformation] that is
 * related to the plan.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002$%B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/example/musify/domain/PremiumPlanInformation;", "", "id", "", "name", "highlights", "", "termsAndConditions", "pricingInformation", "Lcom/example/musify/domain/PremiumPlanInformation$PricingInformation;", "colorInformation", "Lcom/example/musify/domain/PremiumPlanInformation$ColorInformation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/example/musify/domain/PremiumPlanInformation$PricingInformation;Lcom/example/musify/domain/PremiumPlanInformation$ColorInformation;)V", "getColorInformation", "()Lcom/example/musify/domain/PremiumPlanInformation$ColorInformation;", "getHighlights", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "getPricingInformation", "()Lcom/example/musify/domain/PremiumPlanInformation$PricingInformation;", "getTermsAndConditions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ColorInformation", "PricingInformation", "app_debug"})
public final class PremiumPlanInformation {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> highlights = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String termsAndConditions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.domain.PremiumPlanInformation.PricingInformation pricingInformation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.musify.domain.PremiumPlanInformation.ColorInformation colorInformation = null;
    
    /**
     * A class that models a premium plan that is available for purchase.
     * The [colorInformation] property will be used for generating
     * a gradient.
     *
     * @param id the id of the plan.
     * @param name the name of the plan.
     * @param highlights a list of highlights of the plan.
     * @param termsAndConditions the terms and conditions of the plan.
     * @param pricingInformation an instance of [PricingInformation] that is
     * related to the plan.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PremiumPlanInformation copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> highlights, @org.jetbrains.annotations.NotNull()
    java.lang.String termsAndConditions, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.PremiumPlanInformation.PricingInformation pricingInformation, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.PremiumPlanInformation.ColorInformation colorInformation) {
        return null;
    }
    
    /**
     * A class that models a premium plan that is available for purchase.
     * The [colorInformation] property will be used for generating
     * a gradient.
     *
     * @param id the id of the plan.
     * @param name the name of the plan.
     * @param highlights a list of highlights of the plan.
     * @param termsAndConditions the terms and conditions of the plan.
     * @param pricingInformation an instance of [PricingInformation] that is
     * related to the plan.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class that models a premium plan that is available for purchase.
     * The [colorInformation] property will be used for generating
     * a gradient.
     *
     * @param id the id of the plan.
     * @param name the name of the plan.
     * @param highlights a list of highlights of the plan.
     * @param termsAndConditions the terms and conditions of the plan.
     * @param pricingInformation an instance of [PricingInformation] that is
     * related to the plan.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A class that models a premium plan that is available for purchase.
     * The [colorInformation] property will be used for generating
     * a gradient.
     *
     * @param id the id of the plan.
     * @param name the name of the plan.
     * @param highlights a list of highlights of the plan.
     * @param termsAndConditions the terms and conditions of the plan.
     * @param pricingInformation an instance of [PricingInformation] that is
     * related to the plan.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PremiumPlanInformation(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> highlights, @org.jetbrains.annotations.NotNull()
    java.lang.String termsAndConditions, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.PremiumPlanInformation.PricingInformation pricingInformation, @org.jetbrains.annotations.NotNull()
    com.example.musify.domain.PremiumPlanInformation.ColorInformation colorInformation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getHighlights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTermsAndConditions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PremiumPlanInformation.PricingInformation component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PremiumPlanInformation.PricingInformation getPricingInformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PremiumPlanInformation.ColorInformation component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.domain.PremiumPlanInformation.ColorInformation getColorInformation() {
        return null;
    }
    
    /**
     * A class that contains pricing information related to an instance of
     * [PremiumPlanInformation].
     * @param associatedCardId the id of the [PremiumPlanInformation] instance
     * that this information is associated with.
     * @param cost the cost of the plan.
     * @param term the subscription term of the plan.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/musify/domain/PremiumPlanInformation$PricingInformation;", "", "associatedCardId", "", "cost", "term", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssociatedCardId", "()Ljava/lang/String;", "getCost", "getTerm", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PricingInformation {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String associatedCardId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String cost = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String term = null;
        
        /**
         * A class that contains pricing information related to an instance of
         * [PremiumPlanInformation].
         * @param associatedCardId the id of the [PremiumPlanInformation] instance
         * that this information is associated with.
         * @param cost the cost of the plan.
         * @param term the subscription term of the plan.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.musify.domain.PremiumPlanInformation.PricingInformation copy(@org.jetbrains.annotations.NotNull()
        java.lang.String associatedCardId, @org.jetbrains.annotations.NotNull()
        java.lang.String cost, @org.jetbrains.annotations.NotNull()
        java.lang.String term) {
            return null;
        }
        
        /**
         * A class that contains pricing information related to an instance of
         * [PremiumPlanInformation].
         * @param associatedCardId the id of the [PremiumPlanInformation] instance
         * that this information is associated with.
         * @param cost the cost of the plan.
         * @param term the subscription term of the plan.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A class that contains pricing information related to an instance of
         * [PremiumPlanInformation].
         * @param associatedCardId the id of the [PremiumPlanInformation] instance
         * that this information is associated with.
         * @param cost the cost of the plan.
         * @param term the subscription term of the plan.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A class that contains pricing information related to an instance of
         * [PremiumPlanInformation].
         * @param associatedCardId the id of the [PremiumPlanInformation] instance
         * that this information is associated with.
         * @param cost the cost of the plan.
         * @param term the subscription term of the plan.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PricingInformation(@org.jetbrains.annotations.NotNull()
        java.lang.String associatedCardId, @org.jetbrains.annotations.NotNull()
        java.lang.String cost, @org.jetbrains.annotations.NotNull()
        java.lang.String term) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAssociatedCardId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTerm() {
            return null;
        }
    }
    
    /**
     * A data class that contains the [gradientEndColor] and [gradientStartColor]
     * that are associated with a particular [PremiumPlanInformation] instance.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\f\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\r\u0010\u0007J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001c\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0018"}, d2 = {"Lcom/example/musify/domain/PremiumPlanInformation$ColorInformation;", "", "gradientStartColor", "Landroidx/compose/ui/graphics/Color;", "gradientEndColor", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGradientEndColor-0d7_KjU", "()J", "J", "getGradientStartColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/example/musify/domain/PremiumPlanInformation$ColorInformation;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class ColorInformation {
        private final long gradientStartColor = 0L;
        private final long gradientEndColor = 0L;
        
        /**
         * A data class that contains the [gradientEndColor] and [gradientStartColor]
         * that are associated with a particular [PremiumPlanInformation] instance.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A data class that contains the [gradientEndColor] and [gradientStartColor]
         * that are associated with a particular [PremiumPlanInformation] instance.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A data class that contains the [gradientEndColor] and [gradientStartColor]
         * that are associated with a particular [PremiumPlanInformation] instance.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        private ColorInformation(long gradientStartColor, long gradientEndColor) {
            super();
        }
    }
}