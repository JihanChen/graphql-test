/*
 * Copyright $date.year nwillc@gmail.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.test.graph.config;

import com.test.graph.dao.BaseDAO;
import com.test.graph.fetchers.UserMutation;
import com.test.graph.fetchers.UserQuery;
import graphql.schema.GraphQLInputObjectType;
import graphql.schema.idl.RuntimeWiring;

import static graphql.Scalars.GraphQLID;
import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLInputObjectField.newInputObjectField;
import static graphql.schema.GraphQLInputObjectType.newInputObject;

public class UserRuntimeWiringFactory {
    public static RuntimeWiring getRuntimeWiring(BaseDAO baseDAO) {
        GraphQLInputObjectType inputObjectType = newInputObject()
                .name("request")
                .field(newInputObjectField()
                        .name("shopId")
                        .type(GraphQLID))
                .field(newInputObjectField()
                        .name("appVersion")
                        .type(GraphQLID))
                .build();

        return RuntimeWiring.newRuntimeWiring()
                .type("UserQuery", wiring -> wiring
                        .dataFetcher("users", new UserQuery(baseDAO))
                )
                .type("UserMutation", wiring -> wiring
                        .dataFetcher("addusers", new UserMutation())
                )
                .build();
    }
}
