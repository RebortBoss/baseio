/*
 * Copyright 2015-2017 GenerallyCloud.com
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.generallycloud.test.nio.protobuf;

public final class TestProtoBufBean {
    private TestProtoBufBean() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SearchRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.generallycloud.test.nio.protobuf.SearchRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional string query = 1;</code>
         */
        java.lang.String getQuery();

        /**
         * <code>optional string query = 1;</code>
         */
        com.google.protobuf.ByteString getQueryBytes();

        /**
         * <code>optional int32 page_number = 2;</code>
         */
        int getPageNumber();

        /**
         * <code>optional int32 result_per_page = 3;</code>
         */
        int getResultPerPage();

        /**
         * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
         */
        int getCorpusValue();

        /**
         * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
         */
        com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus getCorpus();
    }

    /**
     * Protobuf type {@code com.generallycloud.test.nio.protobuf.SearchRequest}
     */
    public static final class SearchRequest extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:com.generallycloud.test.nio.protobuf.SearchRequest)
            SearchRequestOrBuilder {
        // Use SearchRequest.newBuilder() to construct.
        private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SearchRequest() {
            query_ = "";
            pageNumber_ = 0;
            resultPerPage_ = 0;
            corpus_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private SearchRequest(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            query_ = s;
                            break;
                        }
                        case 16: {

                            pageNumber_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            resultPerPage_ = input.readInt32();
                            break;
                        }
                        case 32: {
                            int rawValue = input.readEnum();

                            corpus_ = rawValue;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                        .setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.generallycloud.test.nio.protobuf.TestProtoBufBean.internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.generallycloud.test.nio.protobuf.TestProtoBufBean.internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.class,
                            com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Builder.class);
        }

        /**
         * Protobuf enum
         * {@code com.generallycloud.test.nio.protobuf.SearchRequest.Corpus}
         */
        public enum Corpus implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNIVERSAL = 0;</code>
             */
            UNIVERSAL(0),
            /**
             * <code>WEB = 1;</code>
             */
            WEB(1),
            /**
             * <code>IMAGES = 2;</code>
             */
            IMAGES(2),
            /**
             * <code>LOCAL = 3;</code>
             */
            LOCAL(3),
            /**
             * <code>NEWS = 4;</code>
             */
            NEWS(4),
            /**
             * <code>PRODUCTS = 5;</code>
             */
            PRODUCTS(5),
            /**
             * <code>VIDEO = 6;</code>
             */
            VIDEO(6), UNRECOGNIZED(-1),;

            /**
             * <code>UNIVERSAL = 0;</code>
             */
            public static final int UNIVERSAL_VALUE = 0;
            /**
             * <code>WEB = 1;</code>
             */
            public static final int WEB_VALUE       = 1;
            /**
             * <code>IMAGES = 2;</code>
             */
            public static final int IMAGES_VALUE    = 2;
            /**
             * <code>LOCAL = 3;</code>
             */
            public static final int LOCAL_VALUE     = 3;
            /**
             * <code>NEWS = 4;</code>
             */
            public static final int NEWS_VALUE      = 4;
            /**
             * <code>PRODUCTS = 5;</code>
             */
            public static final int PRODUCTS_VALUE  = 5;
            /**
             * <code>VIDEO = 6;</code>
             */
            public static final int VIDEO_VALUE     = 6;

            @Override
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static Corpus valueOf(int value) {
                return forNumber(value);
            }

            public static Corpus forNumber(int value) {
                switch (value) {
                    case 0:
                        return UNIVERSAL;
                    case 1:
                        return WEB;
                    case 2:
                        return IMAGES;
                    case 3:
                        return LOCAL;
                    case 4:
                        return NEWS;
                    case 5:
                        return PRODUCTS;
                    case 6:
                        return VIDEO;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Corpus> internalGetValueMap() {
                return internalValueMap;
            }

            private static final com.google.protobuf.Internal.EnumLiteMap<Corpus> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Corpus>() {
                @Override
                public Corpus findValueByNumber(int number) {
                    return Corpus.forNumber(number);
                }
            };

            @Override
            public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Override
            public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
                return com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest
                        .getDescriptor().getEnumTypes().get(0);
            }

            private static final Corpus[] VALUES = values();

            public static Corpus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private Corpus(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:com.generallycloud.test.nio.protobuf.SearchRequest.Corpus)
        }

        public static final int           QUERY_FIELD_NUMBER = 1;
        private volatile java.lang.Object query_;

        /**
         * <code>optional string query = 1;</code>
         */
        @Override
        public java.lang.String getQuery() {
            java.lang.Object ref = query_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                query_ = s;
                return s;
            }
        }

        /**
         * <code>optional string query = 1;</code>
         */
        @Override
        public com.google.protobuf.ByteString getQueryBytes() {
            java.lang.Object ref = query_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                        .copyFromUtf8((java.lang.String) ref);
                query_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
        private int             pageNumber_;

        /**
         * <code>optional int32 page_number = 2;</code>
         */
        @Override
        public int getPageNumber() {
            return pageNumber_;
        }

        public static final int RESULT_PER_PAGE_FIELD_NUMBER = 3;
        private int             resultPerPage_;

        /**
         * <code>optional int32 result_per_page = 3;</code>
         */
        @Override
        public int getResultPerPage() {
            return resultPerPage_;
        }

        public static final int CORPUS_FIELD_NUMBER = 4;
        private int             corpus_;

        /**
         * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
         */
        @Override
        public int getCorpusValue() {
            return corpus_;
        }

        /**
         * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
         */
        @Override
        public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus getCorpus() {
            com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus result = com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus
                    .valueOf(corpus_);
            return result == null
                    ? com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus.UNRECOGNIZED
                    : result;
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getQueryBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
            }
            if (pageNumber_ != 0) {
                output.writeInt32(2, pageNumber_);
            }
            if (resultPerPage_ != 0) {
                output.writeInt32(3, resultPerPage_);
            }
            if (corpus_ != com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus.UNIVERSAL
                    .getNumber()) {
                output.writeEnum(4, corpus_);
            }
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getQueryBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
            }
            if (pageNumber_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageNumber_);
            }
            if (resultPerPage_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, resultPerPage_);
            }
            if (corpus_ != com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus.UNIVERSAL
                    .getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, corpus_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest)) {
                return super.equals(obj);
            }
            com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest other = (com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest) obj;

            boolean result = true;
            result = result && getQuery().equals(other.getQuery());
            result = result && (getPageNumber() == other.getPageNumber());
            result = result && (getResultPerPage() == other.getResultPerPage());
            result = result && corpus_ == other.corpus_;
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            hash = (37 * hash) + QUERY_FIELD_NUMBER;
            hash = (53 * hash) + getQuery().hashCode();
            hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
            hash = (53 * hash) + getPageNumber();
            hash = (37 * hash) + RESULT_PER_PAGE_FIELD_NUMBER;
            hash = (53 * hash) + getResultPerPage();
            hash = (37 * hash) + CORPUS_FIELD_NUMBER;
            hash = (53 * hash) + corpus_;
            hash = (29 * hash) + unknownFields.hashCode();
            return hash;
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
                    extensionRegistry);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER,
                    input);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER,
                    input, extensionRegistry);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
                    extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type
         * {@code com.generallycloud.test.nio.protobuf.SearchRequest}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.generallycloud.test.nio.protobuf.SearchRequest)
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.generallycloud.test.nio.protobuf.TestProtoBufBean.internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.generallycloud.test.nio.protobuf.TestProtoBufBean.internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.class,
                                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Builder.class);
            }

            // Construct using
            // com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @Override
            public Builder clear() {
                super.clear();
                query_ = "";

                pageNumber_ = 0;

                resultPerPage_ = 0;

                corpus_ = 0;

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.generallycloud.test.nio.protobuf.TestProtoBufBean.internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor;
            }

            @Override
            public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest getDefaultInstanceForType() {
                return com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest
                        .getDefaultInstance();
            }

            @Override
            public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest build() {
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest buildPartial() {
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest result = new com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest(
                        this);
                result.query_ = query_;
                result.pageNumber_ = pageNumber_;
                result.resultPerPage_ = resultPerPage_;
                result.corpus_ = corpus_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest) {
                    return mergeFrom(
                            (com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest other) {
                if (other == com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest
                        .getDefaultInstance()) {
                    return this;
                }
                if (!other.getQuery().isEmpty()) {
                    query_ = other.query_;
                    onChanged();
                }
                if (other.getPageNumber() != 0) {
                    setPageNumber(other.getPageNumber());
                }
                if (other.getResultPerPage() != 0) {
                    setResultPerPage(other.getResultPerPage());
                }
                if (other.corpus_ != 0) {
                    setCorpusValue(other.getCorpusValue());
                }
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                return true;
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest) e
                            .getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object query_ = "";

            /**
             * <code>optional string query = 1;</code>
             */
            @Override
            public java.lang.String getQuery() {
                java.lang.Object ref = query_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    query_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string query = 1;</code>
             */
            @Override
            public com.google.protobuf.ByteString getQueryBytes() {
                java.lang.Object ref = query_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                            .copyFromUtf8((java.lang.String) ref);
                    query_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string query = 1;</code>
             */
            public Builder setQuery(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                query_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string query = 1;</code>
             */
            public Builder clearQuery() {

                query_ = getDefaultInstance().getQuery();
                onChanged();
                return this;
            }

            /**
             * <code>optional string query = 1;</code>
             */
            public Builder setQueryBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                query_ = value;
                onChanged();
                return this;
            }

            private int pageNumber_;

            /**
             * <code>optional int32 page_number = 2;</code>
             */
            @Override
            public int getPageNumber() {
                return pageNumber_;
            }

            /**
             * <code>optional int32 page_number = 2;</code>
             */
            public Builder setPageNumber(int value) {

                pageNumber_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 page_number = 2;</code>
             */
            public Builder clearPageNumber() {

                pageNumber_ = 0;
                onChanged();
                return this;
            }

            private int resultPerPage_;

            /**
             * <code>optional int32 result_per_page = 3;</code>
             */
            @Override
            public int getResultPerPage() {
                return resultPerPage_;
            }

            /**
             * <code>optional int32 result_per_page = 3;</code>
             */
            public Builder setResultPerPage(int value) {

                resultPerPage_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 result_per_page = 3;</code>
             */
            public Builder clearResultPerPage() {

                resultPerPage_ = 0;
                onChanged();
                return this;
            }

            private int corpus_ = 0;

            /**
             * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
             */
            @Override
            public int getCorpusValue() {
                return corpus_;
            }

            /**
             * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
             */
            public Builder setCorpusValue(int value) {
                corpus_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
             */
            @Override
            public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus getCorpus() {
                com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus result = com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus
                        .valueOf(corpus_);
                return result == null
                        ? com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus.UNRECOGNIZED
                        : result;
            }

            /**
             * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
             */
            public Builder setCorpus(
                    com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest.Corpus value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                corpus_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>optional .com.generallycloud.test.nio.protobuf.SearchRequest.Corpus corpus = 4;</code>
             */
            public Builder clearCorpus() {

                corpus_ = 0;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            // @@protoc_insertion_point(builder_scope:com.generallycloud.test.nio.protobuf.SearchRequest)
        }

        // @@protoc_insertion_point(class_scope:com.generallycloud.test.nio.protobuf.SearchRequest)
        private static final com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest();
        }

        public static com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SearchRequest> PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
            @Override
            public SearchRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SearchRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SearchRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SearchRequest> getParserForType() {
            return PARSER;
        }

        @Override
        public com.generallycloud.test.nio.protobuf.TestProtoBufBean.SearchRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor                internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = { "\n\ntest.proto\022$com.generallycloud.test.ni"
                + "o.protobuf\"\364\001\n\rSearchRequest\022\r\n\005query\030\001 "
                + "\001(\t\022\023\n\013page_number\030\002 \001(\005\022\027\n\017result_per_p"
                + "age\030\003 \001(\005\022J\n\006corpus\030\004 \001(\0162:.com.generall"
                + "ycloud.test.nio.protobuf.SearchRequest.C"
                + "orpus\"Z\n\006Corpus\022\r\n\tUNIVERSAL\020\000\022\007\n\003WEB\020\001\022"
                + "\n\n\006IMAGES\020\002\022\t\n\005LOCAL\020\003\022\010\n\004NEWS\020\004\022\014\n\010PROD"
                + "UCTS\020\005\022\t\n\005VIDEO\020\006B\022B\020TestProtoBufBeanb\006p"
                + "roto3" };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            @Override
            public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
        internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor = getDescriptor()
                .getMessageTypes().get(0);
        internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_generallycloud_test_nio_protobuf_SearchRequest_descriptor,
                new java.lang.String[] { "Query", "PageNumber", "ResultPerPage", "Corpus", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
